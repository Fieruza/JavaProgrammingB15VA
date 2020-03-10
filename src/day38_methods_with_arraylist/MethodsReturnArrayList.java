package day38_methods_with_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MethodsReturnArrayList {
    public static void main(String[] args) {
        //call getMonths() and print out returned list
        System.out.println(getMonths());
        //call getMonths() and assign returned list into another list then print
        List<String> allMonthsInYear = getMonths();
        System.out.println("allMonthsInYear = " + allMonthsInYear);

        for (String eachMonth: allMonthsInYear) {
            System.out.println("eachMonth = " + eachMonth);
            
        }


    }
    /*
    Method: getMonths()
Params:  none
Return: List<String>
Returns list with all month names.
     */
    public static List<String> getMonths() {
      List<String> allMonth = new ArrayList<>();
        allMonth.add("January");allMonth.add("February");allMonth.add("March");
        allMonth.add("April");allMonth.add("May");allMonth.add("June");
        allMonth.add("July");allMonth.add("August");allMonth.add("September");
        allMonth.add("October");allMonth.add("November");allMonth.add("December");

        return allMonth;
    }
    /*
    List <Integer> nums = getInList(5);
    println(nums); ==> [1, 2, 3, 4, 5]

    List <Integer> nums = getInList(10);
    println(nums); ==> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    Method :getIntList
    Param: int size
    Return: List<Integer>
    It creates list of integers and assign numbers from 1 until size then return it.

     */
public static List<Integer> getInList (int size){
    List<Integer> numbers = new ArrayList<>();

    for (int n = 1; n <= size ; n++) {
        numbers.add(n);
    }
    return  numbers;
}
public static List<Integer> getRandomIntList(int size) {
    Random r = new Random();
    List<Integer> numbers = new ArrayList<>();
    for (int n = 0; n <= size; n++) {
        numbers.add(r.nextInt(101));

    }
    return numbers;
}}