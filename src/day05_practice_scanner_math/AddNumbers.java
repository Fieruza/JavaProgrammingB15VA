package day05_practice_scanner_math;
import java.util.Scanner;

public class AddNumbers {
    public static void main(String [] args){
        Scanner input= new Scanner(System.in);
        System.out.println(" Enter first number:");
        int num1=input.nextInt();
        System.out.println(" Enter second number: ");
        int num2= input.nextInt();

        int sum= num1 + num2;
        System.out.println("Sum is " + sum);

        //No decimal or characters combined with numbers= it will give you error


    }

}