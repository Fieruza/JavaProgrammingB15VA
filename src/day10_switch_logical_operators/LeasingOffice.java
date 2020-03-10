package day10_switch_logical_operators;

import org.w3c.dom.ls.LSOutput;

public class
LeasingOffice {
    public static void main(String[] args){

        System.out.println("Welcome to CyberTek Apartments!");
        System.out.println("Please enter one of the options below:\n0 for Studio\n1 for One bedroom\n2 for Two bedroom\n3 for Three bedroom");
        int numberOfBedrooms = 1;
        double startingPrice = 0.0;
        switch (numberOfBedrooms){
            case 0:
                System.out.println("Studio is Selected");
                startingPrice = 1200.0;
                System.out.println("Starting price is: "+startingPrice);
                break;
            case 1:
                System.out.println("One bedroom is selected");
                startingPrice = 1400.0;
                System.out.println("Starting price is: "+startingPrice);
                break;
            case 2:
                System.out.println("Two bedroom is selected");
                startingPrice = 1650.0;
                System.out.println("Starting price is: "+startingPrice);
                break;
            case 3:
                System.out.println("Three bedroom is selected");
                startingPrice = 2250.0;
                System.out.println("Starting price is: "+startingPrice);
                break;
            default:
                System.out.println("No bedroom selected");
        }
        System.out.println("Thank you for visiting CyberTek Apartments!");
    }
}
