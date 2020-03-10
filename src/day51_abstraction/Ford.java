package day51_abstraction;

public class Ford extends  ElectricCar{
    public void start(){
        System.out.println("Ford start with key on...");
    }
    public void charge(){
        System.out.println("Ford - plugin to electric outlet...");
    }
    public void drive(){
        System.out.println("Ford drives slower... ");
    }

    @Override
    public void jump() {

    }
}

