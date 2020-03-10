package day28_review;

import java.util.Arrays;

public class FillArrayLoop {
    public static void main(String[] args) {
        int[]nums = new int[101]; //declare int array with size 101
        System.out.println(nums[0]); //0- by default all 0s

        for(int i = 0; i<=100; i++){
            nums[i]= i;
        }
        System.out.println(Arrays.toString(nums));

//print same array in reverse in same line
        System.out.println("[");
        for (int i = nums.length-1; i >=0;i--){
            System.out.print(nums[i] + ",");
        }
        System.out.println("]");
    }

}

