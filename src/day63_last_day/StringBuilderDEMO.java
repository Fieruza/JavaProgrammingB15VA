package day63_last_day;

import javax.management.MBeanAttributeInfo;

public class StringBuilderDEMO {
    public static void main(String[] args) {
        String str = "java";
        str = str + ",selenium";
        /*
        java
        ,Selenium
        java, Selenium
         */

        System.out.println("str = " + str);
        StringBuilder stb = new StringBuilder("java");
        stb.append(",selenium");

        System.out.println("stb: "+stb);
        stb.append(",git").append(",github"); //change value in same object.Mutable
        System.out.println("stb: "+ stb);

        StringBuffer stbf = new StringBuffer("java");
        stbf.append(", html").append(",git");
        stbf.reverse();
        System.out.println("stbf = " +stbf);

        String checkStr = "civic";
        StringBuilder stBuilder = new StringBuilder(checkStr);
        stBuilder.reverse();
        if(stBuilder.toString().equals(checkStr)){
            System.out.println("Palindrome");
        }else{
            System.out.println("NOT Palindrome");
        }
        System.out.println(isPalindrome("mom"));
        System.out.println(isPalindrome("dad"));
        System.out.println(isPalindrome("nursesrun"));
        System.out.println(isPalindrome("racecar"));
    }
    public static boolean isPalindrome(String word){
        word = word.replace("", "");
        return new StringBuilder(word).reverse().toString().equalsIgnoreCase(word);
    }
}
