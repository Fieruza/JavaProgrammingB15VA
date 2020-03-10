package day33_methods;

public class Calculator {
    public static void main (String[]args){
        addNums(5, 3);
        int sum = add(10, 4);
}
public static int add(int num1, int num2) {
    int result = num1 + num2;
    return result;
}
    public static int subtract (int num1, int num2){
        int result = num2 - num1;
        return result;
}
    public static void addNums(int num1 , int num2){
        int result = num1 + num2;
        System.out.println("result = " + result);
        
    }
}
