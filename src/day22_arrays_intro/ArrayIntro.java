package day22_arrays_intro;

public class ArrayIntro {
    public static void main(String[] args) {
        //declare int array with size 4
        int [] nums= new int [4];
        //assign values to each index
        nums[0] = 100;
        nums[1] = 200;
        nums[2] = 300;
        nums[3] = 500;
        //nums[4]= 234; ArrayIndexOutOfBoundsException
        //print first number in the array
        System.out.println("number at index 0 : "+ nums[0]);
        System.out.println("number at index 1 : " + nums[1]);
        System.out.println("number at index 2 : " + nums[2]);
        int third= nums[3];
        System.out.println("number at index 3 : " + third);
        System.out.println(nums[4]);

        int i = 0;
        //we can use variable names
        System.out.println(nums[i]);
        //we can change the value of the i
        i++;
        //and use it to the get the value of the nums
        System.out.println(nums[i]);
        //find out how many elements/values
        System.out.println("number of elements: " + nums.length);
        int len = nums.length;
        System.out.println("len = " + len);
        //you can modify the index
        nums[0] = 222;
        System.out.println("nums[0] = " + nums[0]);
        nums[2] = nums[1];
        System.out.println("nums[2] = " + nums[2]);
    }
}
