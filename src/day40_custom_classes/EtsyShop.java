package day40_custom_classes;
//purpose of this class  is to have main method to execute, and create objects from Product class
public class EtsyShop {
    public static void main(String[] args) {
        //declare 2 product objects
        Product prodObj1 = new Product();
        Product prodObj2 = new Product();

        //assign values to prodObj1
        prodObj1.title = "Wooden Banana";
        prodObj1.price = 4.5;
        prodObj1.rating =5;
        prodObj1.seller = " BananaSeller";

        System.out.println(prodObj1.title);
        System.out.println(prodObj2.title);

        prodObj2.title = "Wool Gloves";
        prodObj2.price = 25.44;
        prodObj2.rating =4;
        prodObj2.seller = " WoolSeller";

        //print values from prodObj1
        System.out.println("-----prodObj1 data -----");
        System.out.println("prodObj1 title: "+ prodObj1.title);
        System.out.println("prodObj1 price: "+ prodObj1.price);
        System.out.println("prodObj1 rating: "+ prodObj1.rating);
        System.out.println("prodObj1 seller: "+ prodObj1.seller);

        //print value from prodObj2
        System.out.println("-----prodObj2 data -----");
        System.out.println("prodObj2 title: "+ prodObj2.title);
        System.out.println("prodObj2 price: "+ prodObj2.price);
        System.out.println("prodObj2 rating: "+ prodObj2.rating);
        System.out.println("prodObj2 seller: "+ prodObj2.seller);

        //call the method of Product class
        //objName.methodName();
        prodObj1.displayInfo();
        prodObj2.displayInfo();
    }
    }

