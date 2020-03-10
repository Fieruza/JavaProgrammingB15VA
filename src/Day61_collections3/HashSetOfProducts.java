package Day61_collections3;

import day60_collections2.Product;

import  java.util.*;

public class HashSetOfProducts {
    public static void main(String[] args) {
        Set<Product> prodSet = new HashSet<>();
        prodSet.add(new Product("book", 12.99));
        prodSet.add(new Product("book", 15));
        prodSet.add(new Product("magazine", 17));


        System.out.println(prodSet.size());
        System.out.println(prodSet.toString());
    }
}
