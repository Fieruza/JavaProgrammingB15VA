package day06_operators;
import java.util.Scanner;
public class NextLine {
    public static void main (String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println(" What is your full name?");
        String fullName= input.nextLine();

        System.out.println( fullName + " is coding Java");

        System.out.println( " Enter address: ");
        String address= input.nextLine();

        System.out.println(fullName+ " lives in "+ address );



    }
}
