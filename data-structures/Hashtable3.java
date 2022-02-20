// Hashtable(int size, float fillRatio)

import java.io.*;
import java.util.*;
  
class AddElementsToHashtable {

    public static void main(String args[])
    {
  
        Hashtable<String, Character> ht1
            = new Hashtable<>(4, 0.75f);

        Hashtable<String, Character> ht2
            = new Hashtable<String, Character>(3, 0.5f);

        ht1.put("one", 'a');
        ht1.put("two", 'b');
        ht1.put("three", 'c');
  
        ht2.put("four", 'd');
        ht2.put("five", 'e');
        ht2.put("six", 'f');
  
        // Print mappings to the console
        System.out.println("Mappings of ht1 : " + ht1);
        System.out.println("Mappings of ht2 : " + ht2);
    }
}