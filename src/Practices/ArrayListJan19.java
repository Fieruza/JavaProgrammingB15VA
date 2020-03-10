package Practices;
import java.util.*;
public class ArrayListJan19 {
    public static void main(String[] args) {
      List<Integer> numbersList = new ArrayList<>(Arrays.asList(2, 4, 6, 3, 2, 6, 7, 8));

        System.out.println(removeIt(numbersList, 2));

    }
    public static List<Integer> removeIt(List<Integer> nums, Integer n){
//        while (nums.contains(n)){
//            nums.remove(n);
//        }

        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i).equals(n)){
                nums.remove(i);
                i--;
            }
        }

        return nums;
    }
}
