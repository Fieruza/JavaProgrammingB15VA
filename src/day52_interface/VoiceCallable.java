package day52_interface;

public interface VoiceCallable {
    //public static final variables ONLY
    boolean canCall = true;

    //abstract method
    public abstract void call(String contact);

    /*
    Only abstract methods before Java 8. Pure abstraction /
    AFTER JAVA 8 - static and default methods are added
     */

    //static method
    public static void decline(){
        System.out.println("Nadir declined voice call...");

    }
    //default
    public default void accept (){
        System.out.println("Nadir finally accepted the voice call ");
    }
}
