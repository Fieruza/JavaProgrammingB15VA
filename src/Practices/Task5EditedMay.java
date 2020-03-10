package Practices;
import java.util.*;
public class Task5EditedMay {
    public static void main(String[] args) {
        Anagram("below", "elbow");

}
    public static void Anagram(String x, String y) {
        char a[] = x.toCharArray();
        char b[] = y.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));


        Boolean result = Arrays.equals(a, b);

        if (result == true){
            System.out.println("Strings are anagram");
        }else{
            System.out.println("String are not anagram");

        }
    }

}