package Practices;

import java.util.Scanner;

public class LeftArrayShift {

    public static class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int size = scan.nextInt();  //int shift = 0;
            int[] nums = new int[size];
            for(int i = 0; i < size; i++) {
                nums[i] = scan.nextInt();

                //WRITE YOUR CODE HERE
            }

            for (int i = 0; i < nums.length - 1; i++) {
                nums[i] = nums[i + 1];

            }
            if (0 < nums.length) {
                nums[nums.length - 1] = size;

            }
                System.out.println(nums);
                //return nums;


            }}}