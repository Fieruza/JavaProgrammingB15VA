package day18_for_loop;

public class PrintStars {
    public static void main(String[] args) {

        for (int star = 1; star <= 10; star++) {
            System.out.print("*");
        }
        String myStars = "";
        int starsCount = 50;

        for (int i = 1; i <= starsCount; i++) {
            //System.out.println("myStars = " + myStars);
            myStars += "*";
        }
    }
}
