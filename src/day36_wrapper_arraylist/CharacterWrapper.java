package day36_wrapper_arraylist;

public class CharacterWrapper {
    public static void main(String[] args) {
        char ch1 = 'a';
        System.out.println(Character.isLetter(ch1));
        System.out.println(Character.isDigit(ch1));
        System.out.println(Character.isLowerCase(ch1));
        System.out.println(Character.isAlphabetic(ch1));

        char ch2 = '5';

        System.out.println(Character.isDigit(ch2));
        System.out.println(Character.isLetterOrDigit(ch2));
        System.out.println(Character.isLetterOrDigit(ch2));
    }
}
