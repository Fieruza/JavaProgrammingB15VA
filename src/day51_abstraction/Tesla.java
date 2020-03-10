package day51_abstraction;

public class Tesla extends ElectricCar {
    public void start(){
        System.out.println("Tesla starting by pressing a button.");
    }
    public void charge(){
        System.out.println("Tesla charging - Plugin to Electric. ");
    }
    public void drive(){
        System.out.println("Tesla will drive automatically.");

    }

    @Override
    public void jump() {

    }
}
