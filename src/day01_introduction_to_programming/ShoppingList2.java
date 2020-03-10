package day01_introduction_to_programming;
import java.util.Scanner;
public class ShoppingList2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter Item1, count and its price:");
        String item1= scan.nextLine();
        int count1= scan.nextInt();
        double price1= scan.nextDouble();

        System.out.println("Enter Item2, count and its price:");
        String item2= scan.next();
        int count2= scan.nextInt();
        double price2= scan.nextDouble();

        System.out.println("Enter Item3, count and its price:");
        String item3= scan.next();
        int count3= scan.nextInt();
        double price3= scan.nextDouble();

        double totalPrice= price1 + price2 + price3;

        System.out.println("Item1: " + item1 + " Price: " + price1 + ", Item3: " + item3 + " Price:" + price3 );
        System.out.println("Total price:" + totalPrice);
    }
}
