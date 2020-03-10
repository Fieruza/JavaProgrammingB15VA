package day48_overriding;

public class FullTimeEmployee extends Employee {

    @Override
    public void calculatePay(int hours, double rate) {
        System.out.println("FullTimeEmployee total pay: " + (hours * rate)+ 1.05);
    }
}