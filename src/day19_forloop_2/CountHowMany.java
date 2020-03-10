package day19_forloop_2;

public class CountHowMany {
    public static void main(String[] args) {

        String str= "java loops are fun";
        int count = 0;
        char myChar = 'a';

        //loop from first until last letter
        //compare if it is equal myChar
        //if true increase count by 1
        //After loop print "Count:3"

        for (int n = 0; n < str.length(); n++) {
            System.out.println(str.charAt(n));

        }
    }

}
