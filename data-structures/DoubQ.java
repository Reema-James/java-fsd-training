import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;

class DoubQ
{
	public static void main(String[] args)
	{
			Queue<Double> q= new LinkedList<>();	
            
           // for (int i = 0; i < 5; i++)
            	q.add(5.5);
                q.add(6.6);
                q.add(7.7);
                q.add(8.8);
            System.out.println("Elements of queue "+ q);
                q.add(9.9);   
            System.out.println("Elements of queue "+ q);           
            Double removedele = q.remove();
            System.out.println("removed element-"+ removedele);              
            System.out.println(q);
            Double head = q.peek();
            System.out.println("head of q-" +head);
            int size = q.size();
            System.out.println("Size of queue-"+ size);

             ArrayList<Double> arraylist = new ArrayList<Double>();
        arraylist.add(10.5);
        arraylist.add(20.5);
        arraylist.add(30.5);

        System.out.println("Collection to be added: " + arraylist);
            boolean response = q.addAll(arraylist);
        System.out.println("Collection added: " + response);
        System.out.println("LinkedQueue: " + q);    
            size = q.size();
        System.out.println("Size of queue-"+ size);
        System.out.println("Queue's head: " + q.remove());   
            Double rem = q.remove();
        System.out.println("removed element-"+ removedele);              
        System.out.println(q); 
        System.out.println("queue contains element 20.5?"+q.contains(20.5));
            q.clear();
        System.out.println(q);
        System.out.println("Is the queue empty?"+q.isEmpty());
                                          
	}
}
