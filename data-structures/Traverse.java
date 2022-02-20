// Java program to traversal a
// Java.util.HashMap
 
import java.util.HashMap;
import java.util.Map;
 
public class Traverse 
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> map = new HashMap<>();
 
        // Add elements using put method
        map.put("Richi", 10);
        map.put("Sneha", 30);
        map.put("Leona", 20);
 
        // Iterate the map using
        // for-each loop

       for (Map.Entry<String, Integer> e: map.entrySet())
            System.out.println("Key: " + e.getKey()
                               + " Value: " + e.getValue());
    }
}