import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String> arr = new LinkedHashSet<String>();
		//adding values in LinkedList
		arr.add("Jeeva");
		arr.add("Tharun");
		arr.add("Vinay");
		arr.add("Aashin");
		
		//normal way to print LinkedList
		System.out.println(arr);
		
		//removing one value from list
		arr.remove("Aashin");
		System.out.println(arr);

		 HashSet<String> set1=new HashSet<String>();  
         set1.add("Ajay");  
         set1.add("Jeeva");  
         set1.add(null);
         arr.addAll(set1);  
         System.out.println("Updated List: "+arr);  
         
         arr.removeAll(set1);  
         System.out.println("After invoking removeAll() method: "+arr);
         
         arr.removeIf(str->str.contains("Vinay"));    
         System.out.println("After invoking removeIf() method: "+arr);  
         

	}

}
