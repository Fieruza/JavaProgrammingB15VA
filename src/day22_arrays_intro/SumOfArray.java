package day22_arrays_intro;

public class SumOfArray {
    public static void main(String[] args) {
        //double [] prices= new double [6];
        double[] prices= {24.5, 115.6, 87.8, 78.6, 50};
        double totalPrice= 0.0;
        
        for ( double each: prices){
            totalPrice += each;
            
        }
        System.out.println("totalPrice = " + totalPrice);

        double moreThan50= 0.0;
        for(double p: prices){
            if(p>50){
                moreThan50 +=p;
            }
        }
        System.out.println("moreThan50 = " + moreThan50);

        //loop through each item and if you find price more than 100
        //print "Item too expensive, you don't need that"
        // exit the loop
        for(double price: prices){
            if(price >100){
                System.out.println(price+ "- Item too expensive, you don't need that");
                break;
            }
        }
        }
    }
