package day42_encapsulation;

public class NullValue {
    String inStr;  //inStr = null by default
    int numberOfDays; //0
    public static void main(String[] args) {

        int n;
        String localStr;
       // System.out.println(localStr);
        //System.out.println(n);

        String myString = null;
        Integer num = null;
        System.out.println(num.toString());
        System.out.println(myString);
        System.out.println(myString.length());

    }

}
/*
public class Building{
  String street;  null
  int numberOfFloors; 0
  boolean isResidence; false


  }
 */