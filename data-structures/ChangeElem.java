// Java program to change
// elements of HashMap
 
import java.io.*;
import java.util.*;

class ChangeElem {
    public static void main(String args[])
    {
 
        // Initialization of a HashMap
        HashMap<Integer, String> hm
            = new HashMap<Integer, String>();
 
        // Change Value using put method
        hm.put(1, "one");
        hm.put(2, "three");
        hm.put(3, "three");
 
        System.out.println("Initial Map " + hm);
 
        hm.put(2, "two");
 
        System.out.println("Updated Map " + hm);
    }
}