package day12_ternary_string_manipulation;
import java.util.Scanner;
public class ThreeNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1=10, num2=30, num3=40;
        System.out.println("Enter Three numbers:");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the largest");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the largest");
        } else {
            System.out.println(num3 + " is the largest");
        }
    }
}