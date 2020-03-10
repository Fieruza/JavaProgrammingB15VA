package Practices;

public class Task6 {
    public static void main(String[] args) {
        int num1=1; int num2=8; int num3=2;
        int sumNumbers= num1+num2+num3;

        if(num1*num2> sumNumbers) {
            System.out.println("Excellent result");
        }else{
            System.out.println("Not the numbers I am looking for");

        }

    }
}
//import java.util.*;
//
//public class Main {
//  public static void main(String[] args) {
//    //WRITE YOUR CODE HERE:
//     Scanner scan= new Scanner(System.in);
//
//        System.out.println("Enter Item1, count and its price:");
//        String item1= scan.nextLine();
//        int count1= scan.nextInt();
//        double price1= scan.nextDouble();
//
//        System.out.println("Enter Item2, count and its price:");
//        String item2= scan.next();
//        int count2= scan.nextInt();
//        double price2= scan.nextDouble();
//
//        System.out.println("Enter Item3, count and its price:");
//        String item3= scan.next();
//        int count3= scan.nextInt();
//        double price3= scan.nextDouble();
//
//        double totalPrice= (price1*count1) + (price*count2)+ (price3*count3);
//        int count ;
//
//        if(count>0){
//        }else{
//          System.out.println("Total price :" + totalPrice );
//        }
//
//
//  }
//}