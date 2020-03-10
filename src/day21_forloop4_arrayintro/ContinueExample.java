package day21_forloop4_arrayintro;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            //2 -4 . continue to next iteration
            if(i>=2 && i <=4){
                System.out.println("Skipping - "+ i);
                continue;
            }

            System.out.println("i= "+ i);

        }
    }
}
