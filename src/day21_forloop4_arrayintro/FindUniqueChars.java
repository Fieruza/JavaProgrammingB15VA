package day21_forloop4_arrayintro;

import org.w3c.dom.ls.LSOutput;

public class FindUniqueChars {
    public static void main(String[] args) {
        String str= "jjaavvaa";
        String unique= ""; //jav

        //loop from  beginning until end of str

        for(int n=0; n < str.length(); n++){
            String temp= str.charAt(n)+"";
            System.out.println("temp ="+ temp);
            //check if temp is in unique, if not then add to it
            if(unique.contains(temp));
            //add value to it
            unique= unique+=temp; //longer way unique+temp
        }
        System.out.println("unique =" +unique);
    }

}


/*
package day21_forloop_4_arrayintro;
import java.util.*;
public class FindUniqueChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word:");
        String str = scan.nextLine();
        String unique = "";//jav
        //loop from beginning until end of str
        for(int n = 0; n < str.length(); n++){
            String temp = str.charAt(n)+"";
            System.out.println("temp = " + temp);
            //check if temp is in unique, if not then add to it
            if(!unique.contains(temp)){
                unique = unique + temp;//unique+=temp;
            }
        }
        System.out.println("unique = " + unique);
    }
}





 */

//temp= str.charAt(1)+