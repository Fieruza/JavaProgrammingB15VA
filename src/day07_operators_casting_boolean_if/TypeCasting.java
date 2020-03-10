package day07_operators_casting_boolean_if;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args){
        //Automatic casting--> Implicit casting
        //From Small To Large
        byte b= 100;
        short sh=b;
        int i=sh;

        System.out.println("b: "+ b);
        System.out.println("sh: " + sh);
        System.out.println("i: "+ i);

        int n=123456;
        long l=n; // no need for L at the end
        System.out.println("n: " +n);
        System.out.println("l: "+l);

        double d=n;
        System.out.println("d: "+d);

/// Explicit casting: paranthesis before variable name and type

        int n2=120;
        byte b2= (byte)n2;
        System.out.println("n2: "+ n2);
        System.out.println("b2: "+ b2);


        double price=120.44;
        int intPrice= (int)price;

        System.out.println("price:"+ price);
        System.out.println("intPrice: "+ intPrice);


    }
}
