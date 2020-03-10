package Practices;

public class MuhatarMethods {
    public static void main(String[] args) {

        String str = "AAABBBDDDEEE"; //expected result: ABDE
        String result1 = ""; //store non duplicates

        for (int i = 0; i < str.length() ; i++) {
            result1+= str.substring(i, i+1);
            result1 += str.substring(i, i+1);
        }
    }
}
