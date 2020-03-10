package day50_inheritance_hiding;

    public class City extends Object{
        private String name;
        public City() {
            name = "undefined";
        }
        //Paris
        public City(String name) {
            this.name = name;
        }
            public void letsBuildARoad(){
                System.out.println("City - lets build a road");
                buildARoad();
            }
            public static void buildARoad(){
                System.out.println("City - building a road...");
            }


        @Override
        public String toString(){
            return "name = "+name;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }

/*
public class Engine {
String name;
int horsePower;
int cylinders;
}
public class Tire{
int size;
String brand;
}
public class Car{
String model;
String color;
Engine carEngine;
Tire tire1;
Tire tire2;
Tire tire3;
Tire tire4;
Tire[] tires = new Tire[4];
}

public class Class{
String name;
double price;
}
public class Student{
String name;
Class studentClass;
}

public class School{

}
 */
