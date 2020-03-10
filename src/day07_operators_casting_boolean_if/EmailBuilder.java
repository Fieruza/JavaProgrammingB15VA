package day07_operators_casting_boolean_if;
import java.util.Scanner;
public class EmailBuilder {
    public static void main (String[] args){
    Scanner scan= new Scanner(System.in);
    System.out.println(" Welcome to your new company");
    System.out.println(" Enter first name, last name, company name: ");
    String firstName = scan.next();
    String lastName = scan.next();
    String companyName= scan.next();
// john_smith@cybertek.com
        String email= firstName+ "_"+ lastName+ "@"+companyName+".com";
        System.out.println(email);

        int num5=3456;
        //String str= (String)num5; cannot cast
        String str= num5+ ""; //-->"3456"
        System.out.println( "num5:"+ num5);
        System.out.println("str: "+ str);




    }
}
