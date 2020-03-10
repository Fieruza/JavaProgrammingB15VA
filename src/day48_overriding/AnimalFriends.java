package day48_overriding;

public class AnimalFriends {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.speak();
        animal.move();

        Cat cat = new Cat();
        cat.speak();
        cat.move();

        Horse horse = new Horse();
        horse.speak();
        horse.move();

        Wolf wolf = new Wolf();
        wolf.speak();
        wolf.move();


        animal.eat("apples");
        cat.eat("fish");
        horse.eat("Hay with carrots");
        wolf.eat("gazelle");

    }

}
