import java.util.*;
class ShoppingList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        String in = s.next();

        //your code here
        String order = "burger";
        String food = "chicken";
        String drink = "soda";
        float price = 0;
        if (order.equals("food"))
            if (order.equals("burger") || order.equals("chicken")) {
                price = 10;
                System.out.println(price);

            } else if (drink.equals("soda")) {
                price = 2;
                System.out.println(price);
            }
    }
}