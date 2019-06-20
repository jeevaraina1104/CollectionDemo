import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;

public class HAshMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 HashMap<Integer,String> hm=new HashMap<Integer,String>();    
		    System.out.println("Initial list of elements: "+hm);  
		      hm.put(100,"Amit");    
		      hm.put(101,"Vijay");    
		      hm.put(102,"Rahul");   
		       
		      System.out.println("After invoking put() method ");  
		      for(Map.Entry m:hm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }  
		        
		      hm.putIfAbsent(103, "Gaurav");  
		      System.out.println("After invoking putIfAbsent() method ");  
		      for(Map.Entry m:hm.entrySet()){    
		           System.out.println(m.getKey()+" "+m.getValue());    
		          }  
		      HashMap<Integer,String> map=new HashMap<Integer,String>();  
		      map.put(104,"Ravi");  
		      map.putAll(hm);  
		      System.out.println("After invoking putAll() method ");  
		      for(Map.Entry m:map.entrySet()){    
		           System.out.println(m.getKey()+" "+m.getValue());    
		          }  
		      map.remove(104);
		      System.out.println("After invoking remove method ");  
		      for(Map.Entry m:map.entrySet()){    
		           System.out.println(m.getKey()+" "+m.getValue());    
		          }  
		      
		      map.replace(101, "Vj");
		      System.out.println("After invoking replace method ");  
		      for(Map.Entry m:map.entrySet()){    
		           System.out.println(m.getKey()+" "+m.getValue());    
		          }  
		      
		      Map<Integer,Student> set1 = new HashMap<Integer,Student>();
		      Student s1 = new Student(11,"Jeeva",23);
		      Student s2 = new Student(20,"Vinay",22);
		      Student s3 = new Student(15,"Tharun",24);
		      set1.put(1,s1);
		      set1.put(2,s2);
		      set1.put(3,s3);
		      
		      for(Map.Entry<Integer, Student> entry:set1.entrySet()){    
		          int key=entry.getKey();  
		          Student b=entry.getValue();  
		          System.out.println(key+" Details:");  
		          System.out.println(b.rollno+" "+b.name+" "+b.age);   
		      }    
		      
		 }  
	}


