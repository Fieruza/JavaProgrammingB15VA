package day43_constructor;

public class OurPets {
    public static void main(String[] args) {
        Pet shrek = new Pet();
        shrek.setType("dog");
        shrek.setName("Shrek");
        System.out.println(shrek.toString());
        System.out.println(shrek.getType());
        System.out.println(shrek.getName());

        Pet mimi = new Pet();
        mimi.setPetInfo("cat","Mimi");
        System.out.println(mimi.toString());
        System.out.println(mimi);


    }
}
