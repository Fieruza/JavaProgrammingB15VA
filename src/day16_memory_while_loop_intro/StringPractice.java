package day16_memory_while_loop_intro;

public class StringPractice {
    public static void main(String[] args) {
        String word="jav"; //always 3 characters
        String reversed= ""; //vaj

        //read 3rd letter from word and concatenate to reversed
        //read 2nd letter from word and concatenate to reversed
        //read 1st letter from word and concatenate to reversed

        System.out.println(word.charAt(2));
        reversed= reversed + word.charAt(2);
        System.out.println("reversed =" + reversed);

        reversed= reversed + word.charAt(1);
        System.out.println("reversed =" + reversed);

        reversed= reversed + word.charAt(0);
        System.out.println("reversed =" + reversed);

        //how to compare the original & the reversed are the same

        if(word.equals(reversed)) {
            System.out.println("Palindrome 3letter word");
        }else{
            System.out.println("Non-palindrome 3 letter word");
        }
    }
}
