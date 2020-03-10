package day51_abstraction;

import org.w3c.dom.ls.LSOutput;

public abstract class Student {
    String name;


    public Student(){
        System.out.println("Student constructor");
    }


    public abstract void attendClass();

    public  void code(String lan){
        System.out.println("Student is coding "+lan+"...");
    }
}
