package Practices;
import java.util.*;
public interface Replit_231 {

    public class Main {

        public String reverseVowels(String str) {
            char one = 'a';
            char two = 'b';
            ArrayList<Integer> vowNum = new ArrayList<>();
            char[] charArr = str.toCharArray();
            for (int i = 0; i < str.length(); i++) {
                char temp = str.charAt(i);
                if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u'
                        || temp == 'y' || temp == 'A' || temp == 'E' || temp == 'I' || temp == 'O'
                        || temp == 'U' || temp == 'Y') {
                    vowNum.add(i);
                }
            }
            for (int j = 0; j < vowNum.size()/2; j++) { //apple
                int num1 = vowNum.get(j); //a
                int num2 = vowNum.get(vowNum.size()-1 -j);//e
                char temp = charArr[num1];
                charArr[num1] = charArr[num2];
                charArr[num2] = temp;
            }
            String reverseVowels = new String(charArr);
            return reverseVowels;
        }
    }
}
