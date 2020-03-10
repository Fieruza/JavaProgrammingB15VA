package Practices;

public class ArrayPractice {
    public static void main(String[] args) {
        /*
        given an int array
        1. find average between all numbers
        -add all numbers in array
        -loop through array and find the sum
        -divide the sum by the array length
        2. count how many elements in array is above or equal to average
        -create int count =0;
        -loop through array and check each element
        if element >= average count++
        3. create new array with all elements that are above or equal to average
        - create empty array with size of count
        - loop through array and check each element >= average we will add it to new array
         */

        int [] arr = {30, 0, -5, 45, 87, 14, 65, 4};
        int sum = 0;

        for (int num:arr) {
            sum += num; // equals to sum= sum+num
        }
        int average = sum/arr.length;
        int count = 0;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>= average){
                count++; //count = count + 1
            }
        }
        int[] nums = new int[count]; //will create an array with the size of count

        for (int i = 0; i <= nums.length ; i++) {
            if(arr[i] >= average){
                nums[i]= arr[i];
            }
        }
    }
}
