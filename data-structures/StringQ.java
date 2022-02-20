import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;

class StringQ
{
	public static void main(String[] args)
	{
			Queue<String> q= new LinkedList<>();	
            
            	q.add("one");
                q.add("two");
                q.add("three");
                q.add("four");
            System.out.println("Elements of queue "+ q);
                q.add("five");   
            System.out.println("Elements of queue "+ q);           
            String removedele = q.remove();
            System.out.println("removed element-"+ removedele);              
            System.out.println(q);
            String head = q.peek();
            System.out.println("head of q-" +head);
            int size = q.size();
            System.out.println("Size of queue-"+ size);

         ArrayList<String> arraylist = new ArrayList<String>();
            arraylist.add("six");
            arraylist.add("seven");
            arraylist.add("eight");

        System.out.println("Collection to be added: " + arraylist);
            boolean response = q.addAll(arraylist);
        System.out.println("Collection added: " + response);
        System.out.println("LinkedQueue: " + q);    
            size = q.size();
        System.out.println("Size of queue-"+ size);
        System.out.println("Queue's head: " + q.remove());   
            String rem = q.remove();
        System.out.println("removed element-"+ removedele);              
        System.out.println(q); 
        System.out.println("queue contains element seven?"+q.contains("seven"));
            q.clear();
        System.out.println(q);
        System.out.println("Is the queue empty?"+q.isEmpty());
                                          
	}
}
