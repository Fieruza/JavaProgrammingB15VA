package day45_static_2;

public class ParkingLot {
    public static void main(String[] args) {
        //print numberOfVehicles static way
        System.out.println(Vehicle.numberOfVehicles);

        Vehicle v1 = new Vehicle("tesla cybertruck");
        System.out.println(Vehicle.numberOfVehicles);
        System.out.println(v1.numberOfVehicles);

    }
}
