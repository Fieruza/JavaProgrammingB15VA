package day62_collections4;

import java.util.*;

public class HashMapPractice {
    public static void main(String[] args) {

        //declare hashmap


        Map rawMap = new HashMap(); //polymorphic way
        rawMap.put(1234, 4567);
        rawMap.put(true, false);
        rawMap.put("key", "value");
        rawMap.put("potatoes", 7.0);

        System.out.println(rawMap);

        //declare polymorphic Map<>
        Map<Integer, String> employees = new HashMap<>();

        HashMap<Integer, List<String>> empMap  = new HashMap<>();

        List<Map<Integer, String>> list = new ArrayList<>();

        employees.put(1, "Hanna");
        employees.put(2, "Adora");
        employees.put(3,"Rahel");
        employees.put(4, "Ghirmawit");
        employees.put(5, "Feruz");
        employees.put(6, "May");


        System.out.println(employees.toString());

        System.out.println(2+ "-"+ employees.get(2));
        //or
        int id = 3;
        System.out.println(id+ "-"+ employees.get(3));

        //Rahel- replace, Jahangir for id 3 re

        employees.replace(3, "Jahangir");
        id = 3;
        System.out.println(id+ "-"+employees.get(id)); //Jahangir

//Jahngir - OUT replace Selam

        employees.put(3, "Selam");
        System.out.println(id+ "-"+employees.get(id));

        System.out.println("--size() method");
        System.out.println(employees.size());


        System.out.println("--remove(key) method--");
        employees.remove(1);

        System.out.println(employees.toString());

        System.out.println("--containsKey (key) method--");
        System.out.println(employees.containsKey(1));
        System.out.println(employees.containsKey(6));

        System.out.println("--containsValue(value) method--");
        System.out.println(employees.containsValue("Hanna"));
        System.out.println(employees.containsValue("Tedros"));


        System.out.println("--isEmpty() method--");
        System.out.println(employees.isEmpty());
        System.out.println(empMap.isEmpty());


        System.out.println("--keySet() method--");

        System.out.println("--values() method--");
        System.out.println(employees.values());

        Collection<String> empNames = employees.values();
        System.out.println("empNames = "+ empNames);



    }
}
