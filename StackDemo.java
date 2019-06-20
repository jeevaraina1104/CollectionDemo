import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack st = new Stack(); 
		
		st.push(11);
		st.push("april");
		st.push(1996);
		
		System.out.println("Peek Element :"+ st.peek());
		
		System.out.println("Seach element position "+st.search(11));
		
		while(!st.isEmpty()) {
			System.out.println("Element "+ st.pop());
		}
	}

}
