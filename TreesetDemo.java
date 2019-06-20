import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreesetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> arr = new TreeSet<String>();
		//adding values in LinkedList
		arr.add("Jeeva");
		arr.add("Vinay");
		arr.add("Aashin");
		arr.add("Tharun");
		arr.add("Ann");
		
		//normal way to print LinkedList
		System.out.println(arr);
		
		//removing one value from list
		arr.remove("Ann");
		System.out.println(arr);
		
		 Iterator<String> itr=arr.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  
		  
		  //REverse order
		  System.out.println("Reverse Order");
		  Iterator i=arr.descendingIterator();  
	         while(i.hasNext())  
	         {  
	             System.out.println(i.next());  
	         }  
	         
	         System.out.println("Highest Value: "+arr.pollFirst());  
	         System.out.println("Lowest Value: "+arr.pollLast());  
	
	
	
	
	 TreeSet<String> set=new TreeSet<String>();  
     set.add("A");  
     set.add("B");  
     set.add("C");  
     set.add("D");  
     set.add("E");  
     System.out.println("Initial Set: "+set);  
       
     System.out.println("Reverse Set: "+set.descendingSet());  
       
     System.out.println("Head Set: "+set.headSet("C", false));  
      
     System.out.println("SubSet: "+set.subSet("A", false, "E", true));  
       
     System.out.println("TailSet: "+set.tailSet("C", false));  
     
     
     
     
     TreeSet<Student> set1 = new TreeSet<Student>();
     Student s1 = new Student(11,"Jeeva",23);
     Student s2 = new Student(20,"Vinay",22);
     Student s3 = new Student(15,"Tharun",24);
     set1.add(s1);
     set1.add(s2);
     set1.add(s3);
     
     for(Student s : set1) {
    	 System.out.println(s.rollno +" "+s.name + " "+s.age);
     }
     
	}
	
}
