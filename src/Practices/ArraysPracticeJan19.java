package Practices;
import java.util.*;
public class ArraysPracticeJan19 {
    public static void main(String[] args) {
        String[] strArr = new String[6];
        strArr[0] = "Ahmad";
        strArr[1] = "Mahmood";
        strArr[2] = "John";
        strArr[3] = "May";
        strArr[4] = "David";
        strArr[5] = "Feroz";
        for (int i = 0; i < strArr.length ; i++) {
            if(strArr[i].contains("David")){
                System.out.println("The index for David: "+ i);
            }
        }
        String[] reversed = new String[6];
        int counter = 0;
        for (int i = strArr.length-1; i >=0 ; i--) {
            reversed[counter]= strArr[i];
            counter++;
        }
        System.out.println(Arrays.toString(strArr));
        System.out.println(Arrays.toString(reversed));
        int[] nums1 = {2, 3, 5, 6, 7};
        int[] nums2 = new int[5];
        int counter2 = 0;
        for (int i = nums1.length-1; i >=0 ; i--) {
            nums2[counter2] = nums1[i];
            counter2++;
        }

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

        int[] nums3 = {2, 3, 5, 6, 7, 15};
        System.out.println(Arrays.toString(nums3));
        int temp = nums3[0];
        nums3[0] = nums3[nums3.length-1];
        nums3[nums3.length-1] = temp;
        System.out.println("After switching\n"+Arrays.toString(nums3));

        for(String each : strArr){
            if(each.contains("Mohammad")){
                System.out.println(each + " is in the class");
            }else{
                System.out.println(each + " is not in the class");
            }
        }
    }

}
