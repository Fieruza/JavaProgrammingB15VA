package day04_math_operators_scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main (String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Print enter your favorite city:");

        String city=scanner.next();
        System.out.println("My favorite city is:" +city);

        System.out.println("Please enter your favorite country:");
        String country= scanner.next();

        System.out.println("My favorite country is:" + country);


    }
}
