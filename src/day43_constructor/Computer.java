package day43_constructor;

public class Computer {
    private String brand;
    private String os;
    private double price;



    public Computer(){
        System.out.println("Computer No-Args constructor");
        brand = " unknown brand";
        os = "unknown";

    }
        public void Computer(String Brand,String Os, double Price) {
        System.out.println("Computer 3 args constructor");
        this.brand = brand;
        this.os = os;
        this.price = price;

        }

    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", os='" + os + '\'' +
                ", price=" + price +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
