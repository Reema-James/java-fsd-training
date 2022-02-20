// Java program to Demonstrate
// HashMap(int initialCapacity) Constructor

import java.io.*;
import java.util.*;

class HmapInicap {
 
    public static void main(String args[])
    {
        // No need to mention the
        // Generic type twice
        HashMap<Character, String> hm1 = new HashMap<>(10);
 
        // Initialization of a HashMap using Generics
        HashMap<Integer, String> hm2 = new HashMap<Integer, String>(2);
 
        // Adding elements to object of HashMap
        // using put method
 
        // HashMap 1
        hm1.put('a', "name");
        hm1.put('b', "place");
        hm1.put('c', "age");
 
        // HashMap 2
        hm2.put(4, "four");
        hm2.put(5, "five");
        hm2.put(6, "six");
 
        // Printing elements of ahshMap 1
        System.out.println("Mappings of HashMap hm1 are : "
                           + hm1);
 
        // Printing elements of HashMap 2
        System.out.println("Mapping of HashMap hm2 are : "
                           + hm2);
    }
}