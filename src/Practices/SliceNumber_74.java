package Practices;
import java.util.Scanner;
public class SliceNumber_74 {
    public static void main(String[] args) {
        int num, digit1, digit2, digit3, digit4, digit5;
        Scanner m = new Scanner(System.in);

        System.out.println("Enter your number: ");

        num = m.nextInt();
        digit1= (num /10000)% 10;
        System.out.println(digit1);

        digit2= (num / 1000) % 10;
        System.out.println(digit2);

        digit3 = (num / 100) % 10;
        System.out.println(digit3);

        digit4 = (num / 10) % 10;
        System.out.println(digit4);

        digit5 = (num % 10) ;
        System.out.println (digit5);

    }
}
