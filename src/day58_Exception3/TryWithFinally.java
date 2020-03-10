package day58_Exception3;

public class TryWithFinally {
    public static void main(String[] args) {
        //don't try to use it in real coding,where they pay you
        try {
            System.out.println("In Try Block...");
            System.out.println(9/0);  //easy way to come up with an exception
        }finally {
            System.out.println("In Finally block...");
        }
        System.out.println("After try finally...");
    }
}
