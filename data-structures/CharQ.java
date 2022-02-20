import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;

class CharQ
{
	public static void main(String[] args)
	{
			Queue<Character> q= new LinkedList<>();	
        
            	q.add('a');
                q.add('e');
                q.add('i');
                q.add('o');
            System.out.println("Elements of queue "+ q);
                q.add('u');   
            System.out.println("Elements of queue "+ q);           
            char removedele = q.remove();
            System.out.println("removed element-"+ removedele);              
            System.out.println(q);
            char head = q.peek();
            System.out.println("head of q-" +head);
            int size = q.size();
            System.out.println("Size of queue-"+ size);

             ArrayList<Character> arraylist = new ArrayList<Character>();
        arraylist.add('x');
        arraylist.add('y');
        arraylist.add('z');

        System.out.println("Collection to be added: " + arraylist);
            boolean response = q.addAll(arraylist);
        System.out.println("Collection added: " + response);
        System.out.println("LinkedQueue: " + q);    
            size = q.size();
        System.out.println("Size of queue-"+ size);
        System.out.println("Queue's head: " + q.remove());   
            char rem = q.remove();
        System.out.println("removed element-"+ removedele);              
        System.out.println(q); 
        System.out.println("queue contains element i?"+q.contains('i'));
            q.clear();
        System.out.println(q);
        System.out.println("Is the queue empty?"+q.isEmpty());
                                          
	}
}
