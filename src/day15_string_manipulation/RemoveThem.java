package day15_string_manipulation;

public class RemoveThem {
    public static void main(String[] args) {
        String sentence= "Java is fun";//Javaisfun
        //" " =>""
        String withNoSpaces= sentence.replace(" ", "");
        System.out.println("sentence = " + sentence);
        System.out.println("withNoSpaces = " + withNoSpaces);
        //remove 'is'
        System.out.println(sentence.replace("is ",""));

        String etsyResults= "iphone case (212,713 Results)";

        System.out.println("etsyResults = " + etsyResults); //212713

        String mixed = "!@J#$A%^VA*(";
        mixed= mixed.replace("!@","");
    }
}
