// Java program to add elements
// to the HashMap
 
import java.io.*;
import java.util.*;
 
class AddElem {
    public static void main(String args[])
    {
        HashMap<Integer, String> hm1 = new HashMap<>();
 
        // Initialization of a HashMap
        // using Generics
        HashMap<Integer, String> hm2
            = new HashMap<Integer, String>();
 
        // Add Elements using put method
        hm1.put(1, "add");
        hm1.put(2, "elements");
        hm1.put(3, "using");
 
        hm2.put(1, "the");
        hm2.put(2, "put");
        hm2.put(3, "method");
 
        System.out.println("Mappings of HashMap hm1 are : "
                           + hm1);
        System.out.println("Mapping of HashMap hm2 are : "
                           + hm2);
    }
}