package day33_methods;

public class MethodsWithReturn {
    public static void main(String[] args) {
        System.out.println(getName());
        String myName = getName();
        System.out.println("myName = " + myName);
        //call giveMe5Dollars();
        int wallet = giveMe5Dollars();
        System.out.println("How much in the wallet? -$" + wallet);
    }

        public static String getName(){
            return "Feruz";


        }

        public static int giveMe5Dollars(){
        int dollar =5;
        return dollar;
        }
    }

