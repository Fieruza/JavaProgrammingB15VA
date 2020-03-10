package day11_string_comparison_logical;

public class StringEquals {
    public static void main(String[] args) {
        String str= "java";
        String str2= new String("java");
        //compare using==
        System.out.println(str=="java");
        System.out.println(str2=="java");

        //compare using .equals() method.
        //compare char by char

        System.out.println(str.equals("java"));
        System.out.println(str2.equals("java"));
        System.out.println(str2.equals("Java"));

        //compare using .equalsIgnoreCase() method

        System.out.println(str.equalsIgnoreCase("JAVA"));
        System.out.println(str2.equalsIgnoreCase("Java"));

        //with variables
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str.equals(str2));
    }
}
