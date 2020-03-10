package day11_string_comparison_logical;

public class TollCalculator {
    public static void main(String[] args) {
        String vehicleType= "truck";
        boolean isRushHour= true;
        double tollPrice= 0.0;

        if(vehicleType.equalsIgnoreCase("car") && isRushHour==false) { //!isRushHour=no rush hour
            tollPrice = 3.0;
            System.out.println("Vehicle type: Car. Non-Rush hour");
        }else if(vehicleType.equalsIgnoreCase("car") && isRushHour){
    tollPrice=7.50;
            System.out.println("Vehicle Type: Car. Rush Hour");
        }else if(vehicleType.equalsIgnoreCase("truck") && isRushHour==false){ //isRushHour== no rush hour
            tollPrice=4.75;
            System.out.println("Vehicle Type: Truck.Non-Rush Hour");
        }else if(vehicleType.equalsIgnoreCase("truck") && isRushHour) {
            tollPrice = 11.50;
            System.out.println("Vehicle Type: Truck.Rush Hour");
        }else{
            System.out.println("Vehicle not recognized, use a different car ");


        }
    }
}
