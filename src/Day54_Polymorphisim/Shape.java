package Day54_Polymorphisim;

public class Shape {
    public String type;
    public Shape(){  //adding constructor
        type ="Shape";
    }
    public void draw(){
        System.out.println("Shape: * * * * * *");
    }
}
