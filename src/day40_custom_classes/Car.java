package day40_custom_classes;

public class Car {
    //variable : model, price, color, year

    String model;
    double price ;
    String color;
    int year;
   //acura.setCarInfo("Acura NSX", 44332, "Blue", 2018);
    public void setCarInfo(String newModel, double newPrice, String newColor, int newYear){
        //assign param variables to object instance variable

        model = newModel;
        price = newPrice;
        color = newColor;
        year = newYear;

    }
    public void getCarInfo(){


    }

    public void drive (){
        System.out.println(model+ " is driving ");
    }
    public void showPrice(){
        System.out.println(model+ " price is $"+ price);
    }
}
