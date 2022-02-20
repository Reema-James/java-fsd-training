
// Java program to demonstrate
// updating Hashtable
  
import java.io.*;
import java.util.*;
class HashtableMeth 
{
    public static void main(String args[])
    {

        Hashtable<String, Double> ht
            = new Hashtable<String, Double>();
  
        ht.put("graphs", 2.3);
        ht.put("trees", 5.4);
        ht.put("stack", 7.5);
          
          // print initial map to the console
        System.out.println("Initial Map " + ht);
          
          // Update the value at key 2
        ht.put("stack", 9.5);
          
          // print the updated map
        System.out.println("Updated Map " + ht);

        ht.remove("trees");
  
        System.out.println("Updated map : " + ht);
    }
}

//List interface is used to create a list of elements(objects) that are associated with their index numbers. ArrayList class is used to create a dynamic array that contains objects.
//List <Integer> list1= new ArrayList(); 
//ArrayList<Integer> list=new ArrayList<Integer>();
