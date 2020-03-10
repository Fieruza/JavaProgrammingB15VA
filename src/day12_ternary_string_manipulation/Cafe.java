package day12_ternary_string_manipulation;

public class Cafe {
    public static void main(String[] args) {
        String order= "food";
        String drink= "";
        String food= "pizza";
        double price= 0;


        if(order.equals("food") && food.equals("sandwich")){
            price=7.49;

        }else if(order.equals("food") && food.equals("soup")) {
            price=5.99;
        }else if(order.equals("food") && food.equals("salad")) {
            price = 9.78;
        }else if (order.equals("drink") && drink.equals("soda")) {
            price = 1.99;
        }else if (order.equals("drink") && drink.equals("coffee")) {
            price = 4.99;
        }else if (order.equals("drink") && drink.equals("water")) {
            price = 1.55;
        }else{
            System.out.println("Sorry, no such order available");
            }
            System.out.println("Total price $: " + price);
        }
    }
