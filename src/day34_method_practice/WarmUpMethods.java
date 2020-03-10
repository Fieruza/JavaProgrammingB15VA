package day34_method_practice;

import java.util.Scanner;
public class WarmUpMethods {
    /*
    Method: login
2 Params/input: String userName, String password
return: void
Valid username is "student@cybertek.com"
Valid password: "cybertekb15"
login("student@cybertek.com", "cybertekb15");
	-> Login Successful, Welcome to Cybertek!
login("st@cybertek.com", "cyb15");
	-> ERROR: Login Failed - Invalid credentials!
===================================
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter username and password:");
        login(scan.next(),scan.next());
    }
    public static void login(String userName, String password){
        if(userName.equals("student@cybertek.com") && password.equals("cybertekb15")){
            System.out.println("Login Successful, Welcome to Cybertek!");
        } else {
            System.out.println("ERROR: Login Failed - Invalid Credentials!");
        }
        // userName = "student@cybertek.com";
        //String password = "cybertekb15";
        //"Login Successful, Welcome to Cybertek!"
        //"ERROR: Login Failed - Invalid Credentials!"
    }
}

