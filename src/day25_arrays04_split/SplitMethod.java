package day25_arrays04_split;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        //create a string
        String words = "java,ruby,pyhton,c++";

        //split the words by "," and assign to String[]
        String [] wordsArray= words.split(",");

        System.out.println("Length of wordsArray : "+wordsArray.length);

        System.out.println(wordsArray[0]);
        System.out.println(wordsArray[1]);
        System.out.println(wordsArray[2]);
        System.out.println(wordsArray[3]);

        System.out.println(Arrays.toString(wordsArray));

        String results = "About 117,000,000 results (1.33 seconds)";
        String[] googleArr= results.split("");

        System.out.println("googleArr length : "+ googleArr.length);

        //using for each loop print everyhting in separate lines
        for(String item: googleArr){
            System.out.println(item);
        }
        System.out.println("Search result count: "+googleArr[1]);
   }
}
