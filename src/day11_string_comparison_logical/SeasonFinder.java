package day11_string_comparison_logical;
import java.util.Scanner;
public class SeasonFinder {
    public static void main(String[] args) {
        System.out.println("Enter month ");
        Scanner scan= new Scanner(System.in);


        int month=scan.nextInt();
        //Spring -> 3,4,5
        if(month>=3 && month <=5) {
            System.out.println("Spring ");
        }else if(month>6 && month <=8) {
            System.out.println("Summer");
        }else if(month>9 && month <=11) {
            System.out.println("Fall");
        }else if(month==12 || month==1 || month==2){
            System.out.println("Winter");
        }else{
            System.out.println("Invalid month");
        }


    }
}

//practice for OR or AND