package day19_forloop_2;

public class PrintLetters {
    public static void main(String[] args) {

        //            01234
        String name = "Feruzahalewat";
/*
        for (int i = 0; i <= name.length(); i++) { //i = 7-1
            System.out.println(i + ":" + name.charAt(i));
        }
*/

        //print your name in reverse

        for (int i = name.length()-1; i >=0;i--){
            System.out.print(name.charAt(i));



        /*
       int n= 0;
        System.out.println(name.charAt(n));
        n++;
        System.out.println(name.charAt(n));
        n=name.length();
        System.out.println(name.charAt(n));
        n++;
        */

        }
    }
}
