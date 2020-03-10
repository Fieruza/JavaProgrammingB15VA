package day12_ternary_string_manipulation;

public class CafeNestedIf {
    public static void main(String[] args) {
        String order= "drink";
        String drink= "soda";
        String food= "salad";
        double price= 5.0;

        //OUTER IF STATEMENT
        if (order.equals("drink"))
          //INNER IF STATEMENT.Will run only when order is drink
        if (drink.equals("soda")) {
            price = 1.99;
        }else if(drink.equals("coffee")) {
            price = 1.55;
        }else {
            System.out.println("No such drink available");

        }
    }
}
