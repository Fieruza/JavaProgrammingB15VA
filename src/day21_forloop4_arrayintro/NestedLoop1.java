package day21_forloop4_arrayintro;

public class NestedLoop1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            for (int n = 0; n <= 14; n++) {
                System.out.println(i + "");
            }
            System.out.println();
        }


        for (int outer = 0; outer <= 9; outer++) {
            for (int inner = 0; inner <= outer; inner++) {
                System.out.print(inner + " ");
            }
            System.out.println();
        }
        for (int outer = 9; outer >= 0; outer--) {
            for (int inner = 0; inner <= outer; inner++) {
                System.out.print(inner + " ");
            }
            System.out.println();
        }
    }
}
//