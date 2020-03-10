package Day54_Polymorphisim;

public class Square extends Shape {
    public Square (){
        type = "square";
    }
    @Override
    public void draw (){
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void squareMethod (){
        System.out.println("Square method!");
    }
}
