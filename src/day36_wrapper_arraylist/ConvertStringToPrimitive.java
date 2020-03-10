package day36_wrapper_arraylist;

import javax.print.CancelablePrintJob;

public class ConvertStringToPrimitive {
    public static void main(String[] args) {
        //Boolean, Character, Byte, Short, Integer, Long, Float, Double.

        boolean b1 = Boolean.parseBoolean("true");
        //work around for Strin > char. Character class does not have parse method
        char ch = "a".charAt(0);

        byte byteValue = Byte.parseByte("100");

        short shortValue = Short.parseShort("10000");

        int intValue = Integer.parseInt("34555");

        long longValue = Long.parseLong("123456789123456789");

        float floatValue = Float.parseFloat("123456.789");

        double doubleValue = Double.parseDouble("123456.12345");

        String strPrice = "123.45";
        double doublePrice = Double.parseDouble(strPrice);

        System.out.println("b1 = "+b1);
        System.out.println("ch = "+ch);
        System.out.println("byteValue = "+byteValue);
        System.out.println("shortValue = "+shortValue);
        System.out.println("intValue = "+ intValue);
        System.out.println("longValue = "+longValue);
        System.out.println("floatValue = "+floatValue);
        System.out.println("doubleValue = "+doubleValue);
    }

}
