package day32_custommethods;

import org.w3c.dom.ls.LSOutput;

public class aboutMe {
    public static void main(String[] args) {
        myName();
        morning();
        code();
        code();
        for (int i = 0; i < 10 ; i++) {
            System.out.println();
            code();

        }
    }
    public static void myName(){
        String name= "Weyzerit Feruz";
        System.out.println("Hello My name is "+ name);
    }
    public static void morning(){
        System.out.println("I wake up at 7 am");
        System.out.println("I have my breakfast");
        System.out.println("I go to school ");
    }
    public static void code(){
        System.out.println("I code Java");
        System.out.println("Java is not fun");
    }
}

