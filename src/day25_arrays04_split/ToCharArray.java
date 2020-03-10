package day25_arrays04_split;
import java.util.Arrays;
import java.util.Scanner;
public class ToCharArray {
    public static void main(String[] args) {
        String word= "java";
        char[] letters = word.toCharArray();
        System.out.println("letters length: "+letters.length);
        for(char l: letters){
            System.out.println(l);
        }
        //sort letter array
        Arrays.sort(letters);

        //print all in same separated by commaa
        System.out.println(Arrays.toString(letters));
    }
}
