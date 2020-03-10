package day51_abstraction;

public class AsmaraStudent extends ExchangeStudent {

    @Override
    public void getVisa(){
        System.out.println("AsmaraStudent go to US Embassy for F1 Visa");
    }
    @Override
    public void attendClass(){
        System.out.println("AsmaraStudent attend class");
    }
}
