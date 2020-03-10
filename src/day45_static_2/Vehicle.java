package day45_static_2;

public class Vehicle {

    private String model;
    public static int numberOfVehicles=0;
    public Vehicle() {
    }
    public Vehicle(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                '}';
    }
}