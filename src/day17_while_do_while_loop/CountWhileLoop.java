package day17_while_do_while_loop;

public class CountWhileLoop {
    public static void main(String[] args) throws Exception {
        int counter= 1;
        while (counter <= 10){
            System.out.print(counter + " ");
            counter++;
            Thread.sleep(500);
        }
        //10 9 8 7 6 5 4 3 2 1
        System.out.println(); //add new line or go to new line
        int count1= 10;
        while(count1>=1){
            System.out.print(count1 + " ");
            count1--;
            Thread.sleep(500);
        }
        }
    }
