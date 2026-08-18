//example of collection type (hashmap)
import java.util.*;

public class MapDemo {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("scott", "tiger");
        map.put("jack", "jill");
        map.put("polo", "lili");
        map.put("jack", "rose");   // Replaces "jill" with "rose"

        System.out.println("scott: " + map.get("scott"));         //version java 5
        System.out.println("polo: " + map.get("polo"));
        System.out.println("jack: " + map.get("jack"));

        // Print all keys and values
        System.out.println("\nAll Entries:");
        /*
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }*/

        map.forEach((key, value) -> {                //java version 8
            System.out.println(key + " : " + value);
            //System.out.println(key + " : " + value);
            //System.out.println(key + " : " + value);
            //System.out.println(key + " : " + value);
            //System.out.println(key + " : " + value);
            //System.out.println(key + " : " + value);
            //System.out.println(key + " : " + value);
            //System.out.println(key + " : " + value);
            //System.out.println(key + " : " + value);
            });
        
        }
 
    }