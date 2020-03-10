package day14_string_manipulation;

import javax.xml.namespace.QName;

public class StringStartEndsWith {
    public static void main(String[] args) {
        String word = "selenium";
        System.out.println(word.startsWith("s")); //true
        System.out.println(word.startsWith("selen")); //true
        System.out.println(word.startsWith("el"));//false

        //endsWith practice
        System.out.println(word.endsWith("m"));//true
        System.out.println(word.endsWith(" nium"));//false if there is space


//website google.com
        String website = "www.google.com ";
        if (website.endsWith(".com")) {
            System.out.println("English site");
        }else if (website.endsWith(".edu")) {
            System.out.println("College site");
        }else if(website.endsWith(".gov")) {
            System.out.println("Government site ");
        }
    }
}