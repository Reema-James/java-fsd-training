// Java program to demonstrate
// adding elements to Hashtable
  
import java.io.*;
import java.util.*;
  
class HashTable1 {

    public static void main(String args[])
    {
        Hashtable<Character, Integer> ht1 = new Hashtable<>();
  
        Hashtable<Character, Integer> ht2
            = new Hashtable<Character, Integer>();

        ht1.put('a', 1);
        ht1.put('b', 2);
        ht1.put('c', 3);
  
        ht2.put('d', 4);
        ht2.put('e', 5);
        ht2.put('f', 6);

        System.out.println("Mappings of ht1 : " + ht1);
        System.out.println("Mappings of ht2 : " + ht2);
    }
}