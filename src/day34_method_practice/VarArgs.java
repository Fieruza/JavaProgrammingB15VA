package day34_method_practice;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        sum(20);
        sum(23,43);
        sum(34,54,64,34,234,32);
        sum();
    }
   // public static void main(String[] args) {
        public static void sum (int... nums){

            System.out.println(Arrays.toString(nums));

        }
    }

