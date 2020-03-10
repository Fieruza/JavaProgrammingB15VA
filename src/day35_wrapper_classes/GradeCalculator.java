package day35_wrapper_classes;

public class GradeCalculator {
    //public class ScoreGradeWithMethod {
        public static void main(String[] args) {
            System.out.println(getGrade(95));
            System.out.println(getGrade(83));
        }


    public static char getGrade(int score) {
          //char grade ; if we want additional variable

        if (score <= 100 && score >= 94) {
            return 'A';

        } else if (score >= 80 && score <= 93) {
            return 'B';

        } else if (score >= 50 && score <= 79) {
            return 'C';

        } else if (score >= 30 && score <= 49) {
            return 'D';

        } else if (score >= 0 && score <= 29) {
            return 'F';

        } else {
            System.out.println("Error: Invalid score ");
            return '0';
        }
    }
}
