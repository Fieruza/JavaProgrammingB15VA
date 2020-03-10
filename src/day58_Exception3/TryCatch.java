package day58_Exception3;

import java.io.FileNotFoundException;
import java.io.FileReader;
public class TryCatch {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("file.cvs");
        } catch (FileNotFoundException meck) {
            System.out.println("FileNotFoundException is caught/Handled!");
            meck.printStackTrace();
        /*
            FileNotFoundException is caught/Handled!
            java.io.FileNotFoundException: file.cvs (The system cannot find the file specified)
        */
        }
        System.out.println("After try catch...");
        /*
            After try catch...
            at java.base/java.io.FileInputStream.open0(Native Method)
            at java.base/java.io.FileInputStream.open(FileInputStream.java:213)
            at java.base/java.io.FileInputStream.<init>(FileInputStream.java:155)
            at java.base/java.io.FileInputStream.<init>(FileInputStream.java:110)
            at java.base/java.io.FileReader.<init>(FileReader.java:60)
            at day58_exceptions3.TryCatch.main(TryCatch.java:9)
         */
        try {
            int[] nums = {23, 12, 54};
            System.out.println(nums[0]);
            System.out.println(nums[2]);
            //if (nums.length > 3) {
            System.out.println(nums[3]);
            //}
        }catch(NullPointerException e){
            System.out.println("ArrayIndexOutOfBoundException is caught and Handled....");
        }
        System.out.println("After Array");
    }

    }
