import java.util.Stack;

class StrStk{
public static void main(String[] args)   
{ 

	Stack<String> stk= new Stack<>();  
	// checking stack is empty or not  
	boolean result = stk.empty();  
	System.out.println("Is the stack empty? " + result);  
	// pushing elements into stack  
	stk.push("abc");  
	stk.push("def");  
	stk.push("ghi");  
	stk.push("jkl");  
	//prints elements of the stack  
	System.out.println("Elements in Stack: " + stk);  
	result = stk.empty();  
	System.out.println("Is the stack empty? " + result);
	stk.pop();
	System.out.println(" the last element is =:" +stk.peek());
	System.out.println("position of def in stack is:" +stk.search("def"));  
}
}
