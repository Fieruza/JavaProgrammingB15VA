package day60_collections2;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingAList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java"); list.add("js");list.add("html");
        list.add("ruby");list.add("python"); list.add("kotlin");
        list.add("A++");

        System.out.println("---BEFORE SORTING---");
        System.out.println(list.toString());

        Collections.sort(list);


        System.out.println(list.toString());

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("wooden spoon", 12.99));
        productList.add(new Product("computer bag", 102.99));
        productList.add(new Product("shoes", 120.99));
        productList.add(new Product("bmw 525i", 2700.99));
        productList.add(new Product("macbook pro ", 1499.99));

        System.out.println("--PROD LIST BEFORE SORTING");
        System.out.println(productList.toString());

        Collections.sort(productList);

        System.out.println("--PRO LIST AFTER SORTING ");
        System.out.println(productList.toString());
    }
}
