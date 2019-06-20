
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MeanMinusMedian 
{
    private static float mean = 0;
    private static float median = 0;
    private static float meanMinusMedian = 0;
    private static List<Integer> meanMinusMedianList = null;

    private static void formMeanMinusMedianArr(int data[], int sumOfData) 
    {
        findMean(data, sumOfData);
        findMedian(data);
        if ((mean - median) > meanMinusMedian) {
            meanMinusMedian = mean - median;
            meanMinusMedianList = new ArrayList<Integer>();
            Arrays.stream(data) 
            .forEach(e->meanMinusMedianList.add(e));
        }
    }


private static void findMedian(int[] data) {
    int dataLen = data.length;
    median = data.length % 2 == 0 ? ((float)data[dataLen / 2] + (float)data[dataLen / 2 - 1]) / 2 : data[dataLen / 2];
}


private static void findMean(int[] data, int sumOfData) {
    mean = ((float)sumOfData /(float) data.length);
}

private static void combinationUtil(int arr[], int data[], int start, int end, int index, int runningVal) {
    // Current combination is ready to be printed, print it
    if (index == runningVal) {
        formMeanMinusMedianArr(data, Arrays.stream(data).sum());
        return;
    }
    // replace index with all possible elements. The condition
    // "end-i+1 >= r-index" makes sure that including one element
    // at index will make a combination with remaining elements
    // at remaining positions
    for (int i = start; i <= end && end - i + 1 >= runningVal - index; i++) {
        data[index] = arr[i];
        combinationUtil(arr, data, i + 1, end, index + 1, runningVal);
    }
}


private static void printCombination(int arr[], int n, int runningVal) {
    int data[] = new int[runningVal];
    // Print all combination using temporary array 'data[]'
    combinationUtil(arr, data, 0, n - 1, 0, runningVal);
}

public static void main(String[] args) {
    int arr[] = { 1, 2, 3,4 };
    int runningVal = 1;//Running value
    int len = arr.length;
    for (int i = 1; i < arr.length; i++) {
        printCombination(arr, len, runningVal + i);
    }
    System.out.println(meanMinusMedianList);
}
}