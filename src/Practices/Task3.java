package Practices;

public class Task3 {
    public static void main(String[] args) {
    int num1=10; int num2=35; int num3=20;
    int max= 0;
    if(num1>num2 && num1>num3) {
        max = num1;
    }else if(num2>num1 && num2>num3) {
        max = num2;
    }else if (num3>num1 && num3>num2) { // or I can also do (max=num3) with else only w/o if
        max = num3;
    }
        System.out.println(max);
    }

}
