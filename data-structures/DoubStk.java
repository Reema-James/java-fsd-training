import java.util.Stack;

class DoubStk{
public static void main(String[] args)   
{ 

	Stack<Double> stk= new Stack<>();  
	// checking stack is empty or not  
	boolean result = stk.empty();  
	System.out.println("Is the stack empty? " + result);  
	// pushing elements into stack  
	stk.push(23.43);  
	stk.push(15.50);  
	stk.push(90.99);  
	stk.push(12.22);  
	//prints elements of the stack  
	System.out.println("Elements in Stack: " + stk);  
	result = stk.empty();  
	System.out.println("Is the stack empty? " + result);
	stk.pop();
	System.out.println(" the last element is =:" +stk.peek());
	System.out.println("position of 15.50 in stack is:" +stk.search(15.50));  
}
}
