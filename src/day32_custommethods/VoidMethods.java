package day32_custommethods;

public class VoidMethods {
    public static void main(String[] args) {
        countFrom1to10();
        countFrom1to10();
        iCanDoIt();
    }
    /*
    Method name: countFrom1to10
    It prints 1 - 10 numbers in same line separated by space
     */
    public static void countFrom1to10(){

        for (int k = 1; k <= 10  ; k++) {
            System.out.println(k+ " ");
        }
        System.out.println();
    }
public static void printAtoZ(){
        for(char letter = 'A'; letter <= 'Z'; letter++){
            System.out.println(letter+ " ");
        }
    System.out.println();
}
public static void iCanDoIt(){
    for (int i = 0; i <= 300 ; i++) {
        System.out.print("Java is Fun - I can do it!");

    }
    System.out.println();
}
    /*
     4. Method: displayUSFlag
     Print US flag pattern in the method
     */
    public static void displayUSFlag() {
        String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String p2 = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }
    }
}
