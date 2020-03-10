package day21_forloop4_arrayintro;

public class PrintStarsTriangle {
    public static void main(String[] args) {
           /*
             int columns = 5;
            for(int outer = 1; outer <= columns; outer++){
                for(int inner = 1;inner<= outer; inner++){
                    System.out.print("*");
                }
                System.out.println();
            */


        int columns = 5;
        for (int i = 1; i <= columns; i++) {
            //char myStar= '*';
            //String temp= "";
            for (int j = 1; j <= i; j++) {
                //temp += "" + myStar;

                System.out.print("*");
            }
            System.out.println();
        }
    }
}