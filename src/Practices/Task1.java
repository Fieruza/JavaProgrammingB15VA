package Practices;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                String word = scan.next();
                String letter = "";
                //YOUR CODE HERE

        if(word.length() % 2 == 1 && word.length() >= 3){
            letter = word.substring(word.length()/2 ,(word.length()/2)+1 );
            System.out.println(letter);
        }else if(word.length() == 1) {
            letter = word+word+word;
            System.out.println(letter);
        }else if(word.length() % 2 == 0 && word.length() >= 4){
            letter= word.substring((word.length()/2)-1,(word.length()/2)+1 );
            System.out.println(letter);
        }else if(word.length() ==2){
            letter = word+word;
            System.out.println(letter);
        }


            }
        }
