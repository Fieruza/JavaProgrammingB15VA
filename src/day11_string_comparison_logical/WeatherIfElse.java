package day11_string_comparison_logical;

public class WeatherIfElse {
    public static void main(String[] args) {
        String weather = "sunny";

        if (weather.equals("rainy")) {
            System.out.println("Go to park");
            System.out.println("Code java");
        } else {
            System.out.println("Go to school");
            System.out.println("Code java");
        }

        String item="Wooden Spoon";
        if(item.equalsIgnoreCase("WOODEN spoon")) {
            System.out.println("15,938 wooden spoon for sale");
        }else{
            System.out.println("no wooden spoons");
        }
    }
}
