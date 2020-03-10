package Day57_Exceptions2;

public class RunTimeErrorDemo {
    static int num = 0;
    public static void main(String[] args) {
        num++;
        System.out.println("num = "+num);
        //method called itself it's called recursion
        //call main methos again
        main(null);

    }
}
