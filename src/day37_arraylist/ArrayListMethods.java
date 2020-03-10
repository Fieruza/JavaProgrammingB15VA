package day37_arraylist;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("McLean");
        cities.add("Rome");
        cities.add("Asmara");
        cities.add("Calamba");
        cities.add("Tehran");
        cities.add("Baku");
        cities.add("Berlin");
        cities.add(0, "Calamba"); //add Calamba to index 0
        cities.add(1, "Reston"); //add Reston to index 1

        System.out.println(cities);

        cities.add(2, "Yerevan");
        System.out.println(cities);
        //chane index 4 to New York
        cities.set(4, "New York");
        cities.set(5, "Barcelona");

        System.out.println(cities.toString());

        //remove element | value at index 3
        cities.remove(3);
        System.out.println(cities.toString());

        cities.remove("Baku");
        System.out.println(cities);
    }
}
