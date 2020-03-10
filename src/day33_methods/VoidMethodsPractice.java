package day33_methods;

public class VoidMethodsPractice {
    public static void main(String[] args) {
        //call the method here.
        printDay(1);
        printDay(7);
        buildEmail("Feruz Tedla", "Physicians and Midwives");
        checkEligible(780);
    /*
    Method name: buildEmail
    Input/Params/Args: String name, String company
    - remove spaces from name and company
    - String email -> name@company.com
    -> print email
     */
    }

    public static void buildEmail(String name, String company) {
        name = name.replace(" ", "");
        company = company.replace(" ", "");
        String email = name.toLowerCase() + "@" + company.toLowerCase() + ".com";
        System.out.println(email);
    }

    /*
    Name: checkEligible
    Input : int creditScore
    if creditScore >= 640
    "You are eligible for this loan"
    else
    "Sorry, you are not eligible for this loan"
     */
    public static void checkEligible(int creditScore) {
        if (creditScore >= 640) {
            System.out.println("You are eligible this loan");
        } else {
            System.out.println("Sorry, you are not eligible for this loan");
        }
    }
        public static void printDay(int day){
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
            }
            System.out.println("non of the above");
        }
    }
