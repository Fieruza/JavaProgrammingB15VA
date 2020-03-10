package day51_abstraction;

public class ElectricCarObjects {
    public static void main(String[] args) {
        //ElectricCar = new ElectricCar (); ERROR, cannot be instantiated
        Tesla modelS = new Tesla();
        modelS.model = "Model S";
        modelS.price = 43000;
        modelS.color = "blue";
        modelS.charge();
        modelS.start();
        modelS.drive();
        modelS.stop();


        Ford fusion = new Ford();
        fusion.charge();
        fusion.start();
        fusion.drive();
        fusion.stop();

        //ElectricTruck et = new ElectricTruck(); ERROR
        TeslaSemi semi = new TeslaSemi();
        semi.charge();
        semi.start();
        semi.load("potatoes");
        semi.drive();
        semi.stop();

        TeslaTruck teslaTruck = new TeslaTruck();
        teslaTruck.charge();
        teslaTruck.start();
        teslaTruck.load("tomatoes");
        teslaTruck.drive();
        teslaTruck.stop();



    }
}
