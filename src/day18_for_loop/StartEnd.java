package day18_for_loop;

public class StartEnd {
    public static void main(String[] args) {
        int start = 100;
        int end = 130;

        for (int n = start; n <= end; n++) {
            System.out.print(n + " ");
        }
        System.out.println();
        //print 10 to 0

        for (int f = 10; f >= 0; f--) {
            System.out.print(f + " ");

        }
        start = 25;
        end = 20;

        if (start < end) {
            for (start = start; start <= end; start++)
                System.out.println(start + " ");
        } else{
            for (start = start; start >= end; start--) {
                System.out.println(start + " ");
            }
        }
    }
}
