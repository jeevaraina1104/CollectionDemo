import java.util.Iterator;
import java.util.Vector;

public class VectorDEmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v =  new Vector();
		
		v.addElement(11);
		v.addElement("april");
		v.addElement(1996);
		
		 System.out.println("Vector contents "+v);

	    
	        Iterator it = v.iterator();

	        while(it.hasNext()){
	            System.out.println(it.next());
	        }

	    
	        System.out.println("Element at index 2 is "+v.elementAt(2));

	        System.out.println("Capacity is "+v.capacity());

	 
	        v.removeElementAt(2);
	        System.out.println("Vector contents after removal "+v);

	 
	        v.removeAllElements();
	        System.out.println("Vector size after clear "+v.size());

	}

}
