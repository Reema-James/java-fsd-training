// Java program to remove
// elements from HashMap
 
import java.io.*;
import java.util.*;

class RemovElem {

    public static void main(String args[])
    {

        Map<Integer, String> hm
            = new HashMap<Integer, String>();
 
        // Add elements using put method
        hm.put(1, "monday");
        hm.put(2, "tuesday");
        hm.put(3, "wednesday");
        hm.put(4, "thursday");
 
        // Initial HashMap
        System.out.println("Mappings of HashMap are : "
                           + hm);
 
        // remove element with a key
        // using remove method
        hm.remove(4);
 
        // Final HashMap
        System.out.println("Mappings after removal are : "
                           + hm);
    }
}