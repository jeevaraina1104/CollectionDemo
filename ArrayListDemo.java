import java.util.*;

public class ArrayListDemo {
	
	public static void main(String args[]) {
		
		ArrayList<String> arr = new ArrayList<String>();
		//adding values in arraylist
		arr.add("Jeeva");
		arr.add("Tharun");
		arr.add("Vinay");
		arr.add("Aashin");
		
		//normal way to print arraylist
		System.out.println(arr);
		
		//removing one value from list
		arr.remove("Aashin");
		
		//using iterator to print arraylist
		Iterator itr=arr.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  
		  //using for-each loop method
		  for(String obj:arr) { 
			    System.out.println(obj);  
			 }  
		
		 //adding value at a specific position
		  
		  arr.add(1, "Jason");
		  
		  System.out.println("After adding at specific postions "+ arr);
		  
		  ArrayList<String> list = new ArrayList<String>();
		  list.add("Jeeva");
		  list.add("Raina");
		  
		  System.out.println(list);
		  
		  arr.addAll(list);
		  
		  System.out.println(arr);
		  
		  ListIterator< String> iter = arr.listIterator();
		  System.out.println("Forward direction");
		  while(iter.hasNext()) {
			  System.out.println(iter.next());
		  }
		  System.out.println("Backward direction");
		  while(iter.hasPrevious()) {
			  System.out.println(iter.previous());
		  }
	}

}
