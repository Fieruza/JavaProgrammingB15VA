package Day61_collections3;
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        //Key   ,   Value

        Map<String, Double> items = new HashMap<>();
        items.put("eggs", 4.45);
        items.put("strawberries", 7.99);
        items.put("potatoes", 7.0);
        items.put("cat food", 18.0);
        items.put("tiramisu", 12.99);
        items.put("milk",3.99);

        System.out.println(items.toString());
        System.out.println("size : "+ items.size());

        System.out.println("Price of eggs: "+ items.get("eggs"));
        System.out.println(items.get("strawberries"));//provide the key to get the value
        System.out.println(items.get("potatoes"));
        System.out.println("cat food");
        System.out.println(items.get("Tiramisu")); //key sensitive, it will give me null in the console

        System.out.println(items.keySet());  // returns all keys in Set format
        System.out.println(items.values()); // returns all price in Collection format

        for (String key: items.keySet()) {
            System.out.println("key="+key);
            System.out.println("value="+items.get(key));

        }
        System.out.println(items.containsKey("tiramisu"));

    }
}
