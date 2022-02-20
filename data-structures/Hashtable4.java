//4. Hashtable(Map<? extends K,? extends V> m)

import java.io.*;
import java.util.*;
  
class AddElementsToHashtable {
    public static void main(String args[])
    {
  
        Map<Integer, Character> hm = new HashMap<>();
  
        // Inserting the Elements
        // using put() method
        hm.put(1, 'i');
        hm.put(2, 'j');
        hm.put(3, 'k');
  
        Hashtable<Integer, String> ht2
            = new Hashtable<Integer, String>(hm);
 
  
        System.out.println("Mappings of ht2 : " + ht2);
    }
}