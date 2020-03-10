package day15_string_manipulation;

import jdk.swing.interop.SwingInterOpUtils;

public class StringIndexOf {
    public static void main(String[] args) {
        String technologies = "java,c++,python,tomcat,aws";
        //what to do to find each location of every word
        System.out.println(technologies.indexOf("java"));
        int java, c, python, tomcat, aws;  //declare variable 
        //System.out.println(); Error, nothing assigned
        java = technologies.indexOf("java"); //assign variable
        c = technologies.indexOf("c++");
        python = technologies.indexOf("python");
        tomcat = technologies.indexOf("tomcat");
        aws = technologies.indexOf("aws");
        int html = technologies.indexOf("html");//if it can't find it it will print -1

        System.out.println("java = " + java);
        System.out.println("c = " + c);
        System.out.println("python = " + python);
        System.out.println("tomcat = " + tomcat);
        System.out.println("aws = " + aws);
        System.out.println("html = " + html);

        if (technologies.contains("c++")) {
            System.out.println("c++ is there");
        } else {
            System.out.println("c++ is not present");

            int firstComma = technologies.indexOf(",");
            System.out.println("firstComma = " + firstComma);
            int lastComma = technologies.lastIndexOf(",");
            System.out.println("lastComma = " + lastComma);
            // counts the last part of the given comma character
            // how to find the second or third comma
            int secondComma =technologies.indexOf(",", 5);
            System.out.println(technologies.indexOf(",", secondComma));
        }
  String url= "www.cybertekschool.okta.com";
        //find the first dot then by using that value find the second dot
       
        int firstDot= url.indexOf(".");
        System.out.println("firstDot = " + firstDot);
        int secondDot= url.indexOf(".",firstDot+1);
        System.out.println("secondDot = " + secondDot);
    }
}
