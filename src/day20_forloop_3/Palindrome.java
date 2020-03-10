package day20_forloop_3;

public class Palindrome {
    public static void main(String[] args) {
       //String RaceCar;
       String word= "RACE car";
       //make all lowercase
        word=word.toLowerCase();
        System.out.println(word);
       //String Mom;
        //remove spaces
        word=word.replace(" ","");
        System.out.println(word);

        //reverse the string and assign to reversed variable
        String reversed= "";

        for (int i = word.length()-1; i >=0 ; i--) {
            System.out.print(word.charAt(i));
        }
    }
}
/*
IQ: Palindrome:
    Race Car
    Civic
    Mom
-> case differences are ignores
-> spaces are ignored
-> convert the word into all lowercase
-> get rid of spaces
String reversed = "";
String word = "Ja va";
ja va
word = "java"
------
avaj
reversed = "avaj"
------
Compare if reversed matches word
    true:
        Print "madam is Palindrome"
    false:
        Print "java is Not Palindrome"

 */