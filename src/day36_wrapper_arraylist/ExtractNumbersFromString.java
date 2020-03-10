package day36_wrapper_arraylist;

public class ExtractNumbersFromString {
    public static void main(String[] args) {


        String str = "java123is45fun0";
        //print only numbers
        for (int i = 0; i < str.length() ; i++) {
            char tempChar = str.charAt(i);
            if(Character.isDigit(tempChar)){
                System.out.println(tempChar);
            }
        }
        //declare 2 String variables;
        //String letter = "";
        //String numbers= "";
        //store all letters and number to above variables and print out
        String letters = "";
        String numbers = "";

        for (int n = 0; n < str.length(); n++) {
            char temp = str.charAt(n);
            if(Character.isLetter(temp)){
                letters += temp;

            }else if (Character.isDigit(temp)){
                numbers += temp;
            }
        }
        System.out.println("\nstr = " + str);
        System.out.println("numbers = " + numbers);
        System.out.println("letters = " + letters);

    }

//method: getAllNumbers
//param : String str
//return : Integer
//accepts a string and retrieves all numbers and return as Integer object/

    public static Integer getAllNumbers(String str) {
        String numbers = "";
        for (int n = 0; n < str.length(); n++) {
            if (Character.isDigit(str.charAt(n))) {
                numbers += str.charAt(n);
            }
        }
        //convert String to Integer wrapper
        if (numbers.isEmpty()) {
            return 0;
        } else {
            return Integer.valueOf(numbers);
        }
    }
}