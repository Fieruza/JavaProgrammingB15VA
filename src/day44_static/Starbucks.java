package day44_static;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Starbucks {
    /*
    Method: drinkCoffee
    param: Coffee coffeeObject
    return: void
    Drinking cappuccino and coding java

    Method: orderCoffee
    param: String coffeeName, String coffeeSize
    return: Coffee
    create coffeeObj using coffeeName, coffeeSize, 43.99 and return from method
     */
    public static void drinkCoffee (Coffee coffeeObj){
        System.out.println("Drinking "+coffeeObj.getName()+ " and coding java");
    }
    public static void main(String[] args) {
        Coffee cappuccino = new Coffee("cappuccino", "grande", 3.99);
        cappuccino.drink();
        System.out.println(cappuccino.toString());

        //syntax for array of Coffees
        Coffee[] coffeeArray = new Coffee[2];
        coffeeArray[0]= cappuccino;
        coffeeArray[1]= new Coffee("Latte", "venti",5.99);

        System.out.println(Arrays.toString(coffeeArray));

        //ArrayList of Coffees
        List<Coffee> coffeeList = new ArrayList<>();
        coffeeList.add(cappuccino);
        coffeeList.add(coffeeArray[1]);
        coffeeList.add(new Coffee("Nitro Brew", "tall", 3.49));

        System.out.println(coffeeList.toString());

        //drink first coffee
        coffeeList.get(0).drink();

        //drink all of them
        for (Coffee eachCoffee : coffeeList) {
            eachCoffee.drink();
        }
        System.out.println("----CALL CUSTOM METHOD- DRINK COFFE");

    }
}
