package Practices;

public class Jan_21_myroslava {
    /*
    class office
    private int floor
    String department
    private int unitNumber
    boolean passEntry

    create constructor with 2 parameters:
    department
    passEntry

    the building that will have all Office objects have only 3 floors
    Office unit can be only 3 digits; cannot be 0 and should start with 1,2, or 3

     */
    public class Office{
        private int floor;
        String department;
        private int unitNumber;
        boolean passEntry;

        //create constructor
        public Office(String department, boolean passEntry){
            //this. - it will point to the instance variable
            this.department =department;
            this.passEntry = passEntry;
        }

        //why do we create empty parameter??
        public Office(){}

        public int getFloor() {
            return floor;
        }

        public void setFloor(int floor) {
            this.floor = floor;
        }
    }
}
/*
OOP: encapsulation, inharitance, abstraction, polimorphism

        encapsulation:
            data hiding

            make the field private
            provide access using getters and setters

            benefit:
                security purpose (protect our data)
                we can control what we put inside the field
                easier to maintain (it helps us to avoid some
                errors in the code)

                example:
                    we have object where one of the fields
                    can be only negative int value

                   we directly assigned the negative value

                   we used this object in several places in our project

                   result: we will have a bunch of errors across the project
                            something is not working

                   to handle this we make this field private and we check the
                   value we want to assign directly in setter method

              If we try to assign value to the private field we will get
              compiler error.

              Constructor:
             constractor will be called every time we create an object
             using 'new' keyword
             plays the role of initializing an object (instance variables)

             requirements:
                - same name as a class name
                - can be with params or without
                - no return type
                - can be overloaded

              Example:
              String class:
             String word = new String("Lemon");

             If we don't declare any constructor in the class?
             - we are getting one no-args constructor with empty body by default

             I we provide constructor with params will we get the one by default?
             -No
 */