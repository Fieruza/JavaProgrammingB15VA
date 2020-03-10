package Practices;


import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter seconds:");
        int inputSeconds = scanner.nextInt();

        inputSeconds= 3695;
        int hours= inputSeconds/3600; //whole number of hours 1
        int minutes= inputSeconds%3600/60; //400/60= whole minute
        int seconds=inputSeconds%3600%60/1;
        hours= 5;
        minutes=39;
        seconds=54;


        System.out.println(hours+" hours, " +minutes+" minutes, " +seconds+"seconds");



        //int minRemainder=inputSeconds%3600;
        //400%60=40
        //minutes=minRemainder/60-our whole minutes
        //int secRemainder=

        /* 1 hour=3600 seconds 1 min=60seconds 1 second=1 second */

    }
}
