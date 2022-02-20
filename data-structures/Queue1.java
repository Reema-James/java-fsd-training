import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;

class Queue1
{
	public static void main(String[] args)
	{
			Queue<Integer> q= new LinkedList<>();	
            
            for (int i = 0; i < 5; i++)
            	q.add(i);
            System.out.println("Elements of queue "+ q);
                q.add(10);   
            System.out.println("Elements of queue "+ q);           
            int removedele = q.remove();
            System.out.println("removed element-"+ removedele);              
            System.out.println(q);
            int head = q.peek();
            System.out.println("head of q-" +head);
            int size = q.size();
            System.out.println("Size of queue-"+ size);

             ArrayList<Integer> arraylist = new ArrayList<Integer>();
        arraylist.add(100);
        arraylist.add(200);
        arraylist.add(300);

        System.out.println("Collection to be added: " + arraylist);
            boolean response = q.addAll(arraylist);
        System.out.println("Collection added: " + response);
        System.out.println("LinkedQueue: " + q);    
            size = q.size();
        System.out.println("Size of queue-"+ size);
        System.out.println("Queue's head: " + q.remove());   
            int rem = q.remove();
        System.out.println("removed element-"+ removedele);              
        System.out.println(q); 
        System.out.println("queue contains element 200?"+q.contains(200));
        q.clear();
        System.out.println(q);
        System.out.println("Is the queue empty?"+q.isEmpty());
                                          
	}
}
