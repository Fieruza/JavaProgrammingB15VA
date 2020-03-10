package day58_Exception3;

public class ORCatchBlock {
    public static void main(String[] args) {
        String str = "abc";

        try{
            System.out.println("In Try Block...");
            System.out.println(str.charAt(10));
            String str2 = null;
            System.out.println(str2.toUpperCase());
        }catch (StringIndexOutOfBoundsException | NullPointerException e){
            System.out.println("Exception is caught");
            System.out.println("Message: " + e.getMessage());
            System.out.println("Exception class: "+ e.getClass().getSimpleName());
        }
    }
}
