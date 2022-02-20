// Java program to demonstrate
// adding elements to Hashtable
  
import java.io.*;
import java.util.*;
  
class Hashtable2 {

    public static void main(String args[])
    {
    
        Hashtable<Double, String> ht1 = new Hashtable<>(4);
  
        Hashtable<Double, String> ht2
            = new Hashtable<Double, String>(2);

        ht1.put(1.0, "maths");
        ht1.put(1.1, "physics");
        ht1.put(1.2, "chemistry");
  
        ht2.put(1.3, "algebra");
        ht2.put(1.4, "equations");
        ht2.put(1.5, "reaction");
  
        // Print mappings to the console
        System.out.println("Mappings of ht1 : " + ht1);
        System.out.println("Mappings of ht2 : " + ht2);
    }
}