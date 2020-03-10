package day21_forloop4_arrayintro;

public class MultiplicationTableV2 {
    public static void main(String[] args) {
        /*
        System.out.println("Table for #2");
        for (int n = 1; n <=10 ; n++) {
            int result= n*2;
            System.out.println(n+" x 2= "+ result);

         */
        int number = 2;
        System.out.println("TABLE FOR #" + number);
        for (int n = 1; n <= 10; n++) {
            int result = n * number;
            System.out.println(n + " x " + number + " = " + result);

        }
        for(int outer=1; outer <=10; outer++){
            System.out.println("TABLE FOR #"+outer);
            System.out.println("------------");
            for (int inner = 1; inner <=10 ; inner++) {
                int result= inner * outer;
                System.out.println(inner+" x "+outer+" = "+ result);

            }
        }
    }
}
