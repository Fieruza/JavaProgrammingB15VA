package day29_review;

public class EmployeesData {
    public static void main(String[] args) {
        String str = "Phil Salt [SDET] psalt@g.co";

        int n1 = str.indexOf("[");
        int n2 = str.indexOf("]");
        System.out.println("n1 = "+n1);
        System.out.println("n2 = "+n2);
        //using substring extract job title- using n1, n2
        //1. substring (start,end) 2. substring(start)- from start til end

        String job = str.substring(n1,n2);
        System.out.println("job = "+ job );

        //rewrite the above code into single statement
        System.out.println(str.substring(str.indexOf("[")+1,str.indexOf("]")));

        // TASK2. extract firstName, lastName and assign to variable

        String firstName = str.substring(0, str.indexOf(" "));
        System.out.println("firstName = "+firstName);

        String lastName = str.substring(str.indexOf(" ")+1, str.indexOf(" ["));
        System.out.println("lastName = "+ lastName);

        //how to look for second space
        //indexOf ("char")  indexOf(start, "char")

       // int secondSpace = str.indexOf()
   //TASK3 Extract firstName, lastName, using split method of String class

        //String firstName3;
        String[] strArr = str.split(" ");
        System.out.println("strArr length: "+ strArr.length);
        String firstName3 = strArr[0];
        String lastName3 = strArr[1];

        System.out.println("firstName3 = " + firstName3);
        System.out.println("lastName3 = " + lastName3);

        String firsName4 = str.split(" ")[0];
        String lastName4 = str.split(" ")[1];

        System.out.println("firsName4 = " + firsName4);
        System.out.println("lastName4 = " + lastName4);

        System.out.println(str.split(" ")[3]); //email
    }
}
