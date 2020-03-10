package day32_custommethods;

public class VotingCheck {
    public static void main(String[] args) {
        checkIfCanVote(2);
        printAge(2015);
    }
    public static void checkIfCanVote(int age) {
        if (age >= 18) {
            System.out.println(age + "- You are eligible to vote");
        } else {
            System.out.println(age + "- You are not eligible to vote ");
        }
    }
        public static void printAge(int birthYear){
        int age= 2019-birthYear;
            System.out.println(birthYear+ ": birthYear. age: "+ age);
            if(birthYear < 0 || birthYear > 2019)
                System.out.println("ERROR: birthYear is not a valid BirthYear");
    }
}
