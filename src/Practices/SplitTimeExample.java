package Practices;

public class SplitTimeExample {
    public static void main(String[] args) {
        int[] time1 = {12, 45, 5};
        int[] time2 = {12, 45, 7};
        // check if time1 and time2 have valid values
        // hour - 0 - 23 minute - 0 - 59
        if (time1[0] < time2[0] || time1[1] < time2[1] || time1[2] < time2[2]) {
            System.out.println("time1 is earlier : " + time1[0] + ":" + time1[1] + ":" + time1[2]);
        } else if (time1[0] > time2[0] || time1[1] > time2[1] || time1[2] < time2[2]) {
            System.out.println("time2 is earlier : " + time2[0] + ":" + time2[1] + ":" + time2[2]);
        } else if (time1[0] == time2[0] || time1[1] == time2[1] || time1[2] < time2[2]) {
            System.out.println("time1 and time 2 are equal : " + time1[0] + ":" + time1[1] + ":" + time1[2] + " and "
                    + time2[0] + ":" + time2[1] + ":" + time2[2]);
        }
    }
}
/*
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    //WRITE YOUR CODE HERE

        String reverse = "";


         for(int i = word.length()- 1; i >= 0; i--){
           reverse = reverse + word.charAt(i);

          if(word.length() < 5){
            System.out.println("Too short!");

          }else if(word.length() > 5){
            System.out.println("Too long");

          }else if (word.length() == 5){


           // System.out.println(reverse);

        }

    }
    System.out.println(reverse);
}}
 */