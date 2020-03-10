package day31_multidarrays_methods;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        //declare 2 D String array list
        //or String list [][] or String[] list[];

        String[][] list = new String[4][3];
        //add vegetables
        list[0][0] = "Potatoes";
        list[0][1] = "Carrots";
        list[0][2] = "Onions";
//add fruits
        list[1][0] = "Apples";
        list[1][1] = "Kiwi";
        list[1][2] = "Figs";
//add dairy
        list[2][0] = "Milk";
        list[2][1] = "Eggs";
        list[2][2] = "Cheese";
//add bakery
        list[3][0] = "Bread";
        list[3][1] = "Bagel";
        list[3][2] = "Muffin";

        System.out.println(list[0][0] + "," + list[0][1] + "," + list[0][2]);
        System.out.println(list[1][0] + "," + list[1][1] + "," + list[1][2]);
        System.out.println(list[2][0] + "," + list[2][1] + "," + list[2][2]);
        System.out.println(list[3][0] + "," + list[3][1] + "," + list[3][2]);

        System.out.println(Arrays.deepToString(list));

        String fruit = list[1][1];
        System.out.println("My favourite fruit: " + fruit);

        //lets find out how many array in the 2D array

        System.out.println("Number of arrays/rows: "+list.length);
        //how many vegetable
        System.out.println("Number of vegetables: "+list[0].length);
        System.out.println("Number of fruits: "+list[1].length);
        System.out.println("Number of dairy: "+list[2].length);
        System.out.println("Number of bakery: "+list[3].length);

        //how to print using a loop
        //print all vegetables using a loop
        for (int i = 0; i < list[0].length ; i++) {
            System.out.println(list[0][i]);

        }
        //print all bakery items
        for (int i = 0; i < list[3].length ; i++) {
            System.out.println(list[3][i]);

        }
        //print all dairy using for each loop

        for (String fruits : list[2]) {
            System.out.println(fruits);
        }
        //String [][] list = new String[4][3]; rows -4, col -3
        //Print all items using nested for loop

        for(int i = 0; i < list.length  ;i++){
            System.out.println("Row: "+ i);
            for(int j= 0; j < list[i].length; j++){
                System.out.print(" Col: "+ j +"-");
                System.out.print(list[i][j]);
            }

        }
    }
}
