package day13_string_manipulation;

public class StringCaseConv2 {
    public static void main(String[] args) {
        String word = "Cybertek School";
        //print the word in all uppercase
        System.out.println(word.toUpperCase());
        //convert word to all uppercase and store into uWord variable
        String uWord = word.toUpperCase();
        System.out.println("uWord= " + uWord);
        //print value of word, and see if it is uppercase or still same
        System.out.println("word = " + word);
        //convert all characters of word in to uppercase
        word = word.toUpperCase();

        System.out.println("word = " + word);

        String lWord = word.toLowerCase();
        System.out.println("lWord = " + lWord);
        //check if lWord is "cybertek school"
        if (lWord.equals("cybertek school")) {
            ;
        } else {
            System.out.println("lWord is not all lowercase or does not match");

        }
    }
}