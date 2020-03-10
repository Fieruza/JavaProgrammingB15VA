package Practices;

import java.util.Scanner;

public class Replet1 {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


            //TODO: Write your code below
            String m="";

            for (int i=0;i<=words.length;i++){
                for(int j=words.length-1;i>=0;j--){
                    m=words[i]+words[j];
                }
                System.out.println(m);


        }}
}