package day40_custom_classes;

public class CarGurus {
    public static void main(String[] args) {
        Car acura = new Car();
        acura.model = "Acura ILX";
        acura.year = 2020;
        acura.color="black ";
        acura.price= 2815.0;

        System.out.println("acura model = " + acura.model);
        acura.drive();
        acura.showPrice();

        //another car object
        Car bmw = new Car();
        bmw.model = "BMW 5 series";
        bmw.year = 2019;
        bmw.color="Black ";
        bmw.price= 51115.0;

        bmw.drive();
        bmw.showPrice();

        //another car object
        Car porsche = new Car();
        porsche.setCarInfo("Porsche 911",127753,"Grey", 2020);
        porsche.drive();
        porsche.showPrice();


        Car toyota = new Car();
        toyota.setCarInfo("Toyota Prius",21452.0, "Grey",2019);

        System.out.println(toyota.model);
        System.out.println(toyota.price);
        System.out.println(toyota.color);
        System.out.println(toyota.year);

        //call getCarInfo for all car object we have

        acura.getCarInfo();
        bmw.getCarInfo();
        porsche.getCarInfo();
        toyota.getCarInfo();

        //compate prices of bmw and porsche and print which one is more expensive

        if(bmw.price > porsche.price){
            System.out.println("BMW is more expensive");
        }else{
            System.out.println("Porsche is more expensive");
        }

    }
}
