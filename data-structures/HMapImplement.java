import java.util.HashMap;

public class HMapImplement{
 
    public static void main(String[] args)
    {
        HashMap<String, Integer> map = new HashMap<>();
 
        // Adding elements to the Map
        // using standard add() method
        map.put("Apple", 50);
        map.put("Orange", 70);
        map.put("Grapes", 90);
 
        // Print size and content of the Map
        System.out.println("Size of map is:- " + map.size());
 
        // Printing elements in object of Map
        System.out.println(map);
 
        // Checking if a key is present and if
        // present, print value by passing
        // random element

        if (map.containsKey("Orange")) {
 
            // Mapping
            Integer a = map.get("Orange");
 
            // Printing value fr the corresponding key
            System.out.println("value for key"
                               + " \"Orange\" is:- " + a);
        }
    }
}