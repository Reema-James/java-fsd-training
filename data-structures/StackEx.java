import java.util.Stack;

class StackEx{
public static void main(String[] args)   
{ 

	Stack<Integer> stk= new Stack<>();  
	// checking stack is empty or not  
	boolean result = stk.empty();  
	System.out.println("Is the stack empty? " + result);  
	// pushing elements into stack  
	stk.push(78);  
	stk.push(113);  
	stk.push(90);  
	stk.push(120);  
	//prints elements of the stack  
	System.out.println("Elements in Stack: " + stk);  
	result = stk.empty();  
	System.out.println("Is the stack empty? " + result);
	stk.pop();
	System.out.println(" the last element is =:" +stk.peek());
	System.out.println("position of 113 in stack is:" +stk.search(113));  
}
}
