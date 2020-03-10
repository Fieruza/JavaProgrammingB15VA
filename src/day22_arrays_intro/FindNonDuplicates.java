package day22_arrays_intro;

public class FindNonDuplicates {
    public static void main(String[] args) {

        String str = "java";

        for(int i=0; i<str.length(); i++){
            char letter= str.charAt(i); //read a letter and store
            System.out.println("checking - "+ letter);//print
            //inner loop to loop through each letter again
            for (int j = 0; j < str.length() ; j++) {
                System.out.println("Comparing Inner loop letter: "+str.charAt(j));
                //check if letter matches any letter in inner loop
                //also make sure i and j are not same
                //if they are same, it will mean we are looking same letter in same position
                if (str.charAt(j) == letter && i !=j){
                    System.out.println(letter + " has a duplicate");
                }
            }
        }


    }
}
//outer loop: read a character from str and store into variable
//inner loop: loop through the str , and read one char at a time
//check if it equals to char from outer loop also check if indexes are not same
//if above conditions are true, that character is not unique