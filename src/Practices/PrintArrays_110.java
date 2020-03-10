package Practices;

import java.util.Scanner;

public class PrintArrays_110 {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


            //TODO: Write your code below

            for(int i=0; i<5 ; i++) {


                System.out.print(words[i].substring(0, 1) + words[1].substring(words[i].length() - 1));
            }
        }
    }



