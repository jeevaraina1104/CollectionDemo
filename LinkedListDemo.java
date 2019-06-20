import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> arr = new LinkedList<String>();
		//adding values in LinkedList
		arr.add("Jeeva");
		arr.add("Tharun");
		arr.add("Vinay");
		arr.add("Aashin");
		
		//normal way to print LinkedList
		System.out.println(arr);
		
		//removing one value from list
		arr.remove("Aashin");
		
		//using iterator to print LinkedList
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
		  
		  LinkedList<String> list = new LinkedList<String>();
		  list.add("Jeeva");
		  list.add("Raina");
		  
		  System.out.println(list);
		  
		arr.removeAll(list);
		  System.out.println(arr);
		  
		  arr.removeFirst();
		  System.out.println(arr);
		  
		  arr.removeLast();
		  System.out.println(arr);
		  
		  System.out.println("Hashcode "+arr.hashCode());
		  
	

		  

		  


	}

}
