package day14_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String email = "student@gmail.com";
        System.out.println(email.contains("@"));//true
        System.out.println(email.contains("#"));//false
        System.out.println(email.contains("gmail")); //true
        System.out.println(email.contains("stunt"));//false

        //see if ".com is in the email, and store results into variable

        String list = "milk, eggs, bread, turkey, water,chocolate,potatoes, apples";

        //using if statement check if "turkey" is in the list
        //if yes--> "Turkey is there!" not-->"We forgot turkey"

        if (list.contains("turkey")) {
            System.out.println("turkey ");
        } else {
            System.out.println("We forgot turkey");


            if (list.contains("bananas")) {
                System.out.println("Bananas are in the list");
            }else{
                System.out.println("Let's add Bananas");
            }

            //check if list contain "milk" and store results into hasMilk variable

            boolean hasMilk=list.contains("milk");
            System.out.println("hasMilk = " + hasMilk);
            if(hasMilk){
                System.out.println("We got the milk");
                //look for WATER
                boolean hasWater= list.toUpperCase().contains("WATER");
                System.out.println("hasWater = " + hasWater);
            }

        }
    }
}
