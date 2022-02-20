import java.util.Stack;

class CharStk{
public static void main(String[] args)   
{ 

	Stack <Character> stk= new Stack<>();  
	// checking stack is empty or not  
	boolean result = stk.empty();  
	System.out.println("Is the stack empty? " + result);  
	// pushing elements into stack  
	stk.push('a');  
	stk.push('e');  
	stk.push('o');  
	stk.push('u');  
	//prints elements of the stack  
	System.out.println("Elements in Stack: " + stk);  
	result = stk.empty();  
	System.out.println("Is the stack empty? " + result);
	stk.pop();
	System.out.println(" the last element is =:" +stk.peek());
	System.out.println("position of e in stack is:" +stk.search('e'));  
}
}
