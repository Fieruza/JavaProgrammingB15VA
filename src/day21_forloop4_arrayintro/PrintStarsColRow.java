package day21_forloop4_arrayintro;
import java.util.Scanner;
public class PrintStarsColRow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = 5;
        int columns = 5;

        for (int row = 1; row <= rows; row++) {
            for (int col = 0; col <= columns; col++) {
                System.out.print(" * ");
            }
            System.out.println();


            }
        }
    }

