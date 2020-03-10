package day48_overriding;

public class Horse extends Animal {
    public void speak() {
        System.out.println("Horse is saying IMADDDD...");

    }

    @Override//Verify that move method is overridden
    public void move() {
        System.out.println("Horse is galloping...");

    }

    @Override
    public void eat(String food) {
        System.out.println("Horse is enjoying " + food + "...");
    }
}