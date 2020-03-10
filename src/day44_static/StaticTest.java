package day44_static;

public class StaticTest {
    public static void main(String[] args) {
        //System.out.println(StaticVariables.name);
        StaticVariables obj = new StaticVariables();
        System.out.println(obj.name);

        System.out.println(StaticVariables.userName);
        System.out.println(StaticVariables.age);
        System.out.println(StaticVariables.price);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        //System.out.println(Calculator.plus(4,6));
        Calculator calc = new Calculator();
        System.out.println(calc.plus(7,6));
        System.out.println(Calculator.minus(10,8));
        int result = Calculator.divide(10,2);
        System.out.println("result = " + result);


        System.out.println(Math.abs(11));
        System.out.println(Math.abs(-8));

        System.out.println(Math.max(100,500));
    }

}
