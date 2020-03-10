package day11_string_comparison_logical;
import java.util.Scanner;
public class AmazonShopping {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        boolean isPrimeMember= true;
        double totalOrderPrice=100.1;

        System.out.println("Welcome to Amazon shopping");

        System.out.println("Are you a prime member?");
        isPrimeMember= scan.nextBoolean();

        System.out.println("Enter total order price: ");
        totalOrderPrice= scan.nextDouble();

        if(totalOrderPrice<0){
            System.out.println("Invalid Order Price!");
            return; //STOP PROGRAM at this point, do not run rest of code below
        }

        if(isPrimeMember || totalOrderPrice >=25.0){
            System.out.println("Your order is eligible for free shipping");
        }else{
            System.out.println("Your order is not eligible for free shipping");
        }


    }
}
