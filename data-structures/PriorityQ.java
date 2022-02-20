import java.util.*;
  
class PriorityQ {
    
    public static void main(String args[])
    {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
  
        pq.add(10);
        pq.add(20);
        pq.add(15);
        pq.add(25);

        System.out.println(pq.peek());

        Iterator iterator = pq.iterator();
        while (iterator.hasNext()) 
        {
        System.out.print(iterator.next() + " ");
        }

        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.peek());

          pq.remove(15);
        System.out.println("After Remove - " + pq);
  
        System.out.println("Poll Method - " + pq.poll());
  
        System.out.println("Final PriorityQueue - " + pq);
    }
}