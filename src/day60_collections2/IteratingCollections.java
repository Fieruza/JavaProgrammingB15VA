package day60_collections2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("js");
        list.add("html");
        list.add("ruby");
        list.add("python");
        list.add("kotlin");

        for (String str : list) {
            System.out.println(str);

        }
        //Iterator Interface

        Iterator<String> it = list.iterator();
/*
        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
*/
       while (it.hasNext()){
           System.out.println(it.next()); //print current value and go to next
           it.remove(); //remove the current value

       }

        System.out.println(it.next());
    }
}