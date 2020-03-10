package day51_abstraction;

public abstract class ElectricCar {

        String model;
        double price;
        String color;


        //ElectricCar ec = new ElectricCar is abstract and can NOT be initiated
        public abstract void start(); //WHAT TODO, instead of HOW TODO. HIDE IMPLEMENTATION
        public abstract void charge();
        public abstract void drive();
        public abstract void jump();

        public void stop(){
            System.out.println("Electric car is stopping by pushing break...");
        }
    }

