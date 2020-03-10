package day34_method_practice;

public class FormatString {
    public static void main(String[] args) {
        String results = "About 1,250,000,000 results (0.83 seconds)";
        String countOfRs = results.split(" ")[1];//split and get index of countOfRs
        System.out.println("countOfRs = " + countOfRs);

        repeatString("java", 5, '%');
        repeatString("I code java", 30, '!');
        System.out.println(repeatReturnString(" Nutella is delicious ", 5,'!'));

        //remove commas with empty space using replace method
        countOfRs = countOfRs.replace(",", " ");
        System.out.println("countOfRs = " + countOfRs);
//convert using the parseLong method
        // long count = Long.parseLong(countOfRs); //convert string numbers into long
    }


    public static void repeatString(String word, int times, char delimiter) {
        for (int i = 1; i <= times; i++) {
            System.out.println(word + delimiter);

        }
        System.out.println();
    }

    public static String repeatReturnString(String word, int times, char delimiter) {
        String word1 = "";
        for (int i = 1; i <= times; i++) {
            word1 += word + delimiter;
        }
        return word1;
    }
}