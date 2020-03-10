package day11_string_comparison_logical;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class CarShopping {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Welcome to our Car Dealership");

        System.out.println("Enter the car model: ");
        String carModel= scan.next();

        System.out.println("Enter the price: ");
        double carPrice= scan.nextDouble();

        double budget= 35000;

        if (carModel.equals("toyota") || carModel.equals("tesla") && carPrice<= budget){
            System.out.println("I like this car model");
        }else{
            System.out.println("I don't like this car model");
        }

    }

}

