package day26_arrays05;

import java.util.Arrays;

public class PopularNames {
    public static void main(String[] args) {
        String[] names = {"James", "Mary",
                "John", "Patricia",
                "Robert", "Jennifer",
                "Michael", "Linda",
                "William", "Elizabeth",
                "David", "Barbara",
                "Richard", "Susan",
                "Joseph", "Jessica",
                "Thomas", "Sarah",
                "Charles", "Margaret",
                "Christopher", "Karen",
                "Daniel", "Nancy",
                "Matthew", "Lisa",
                "Anthony", "Betty",
                "Donald", "Dorothy",
                "Mark", "Sandra",
                "Paul", "Ashley",
                "Steven", "Kimberly",
                "Andrew", "Donna",
                "Kenneth", "Emily",
                "George", "Carol",
                "Joshua", "Michelle",
                "Kevin", "Amanda",
                "Brian", "Melissa",
                "Edward", "Deborah",
                "Ronald", "Stephanie",
                "Timothy", "Rebecca",
                "Jason", "Laura",
                "Jeffrey", "Helen",
                "Ryan", "Sharon",
                "Jacob", "Cynthia",
                "Gary", "Kathleen",
                "Nicholas", "Amy",
                "Eric", "Shirley",
                "Stephen", "Angela",
                "Jonathan", "Anna",
                "Larry", "Ruth",
                "Justin", "Brenda",
                "Scott", "Pamela",
                "Brandon", "Nicole",
                "Frank", "Katherine",
                "Benjamin", "Samantha",
                "Gregory", "Christine",
                "Raymond", "Catherine",
                "Samuel", "Virginia",
                "Patrick", "Debra",
                "Alexander", "Rachel",
                "Jack", "Janet",
                "Dennis", "Emma",
                "Jerry", "Carolyn",
                "Tyler", "Maria",
                "Aaron", "Heather",
                "Henry", "Diane",
                "Jose", "Julie",
                "Douglas", "Joyce",
                "Peter", "Evelyn",
                "Adam", "Joan",
                "Nathan", "Victoria",
                "Zachary", "Kelly",
                "Walter", "Christina",
                "Kyle", "Lauren",
                "Harold", "Frances",
                "Carl", "Martha",
                "Jeremy", "Judith",
                "Gerald", "Cheryl",
                "Keith", "Megan",
                "Roger", "Andrea",
                "Arthur", "Olivia",
                "Terry", "Ann",
                "Lawrence", "Jean",
                "Sean", "Alice",
                "Christian", "Jacqueline",
                "Ethan", "Hannah",
                "Austin", "Doris",
                "Joe", "Kathryn",
                "Albert", "Gloria",
                "Jesse", "Teresa",
                "Willie", "Sara",
                "Billy", "Janice",
                "Bryan", "Marie",
                "Bruce", "Julia",
                "Noah", "Grace",
                "Jordan", "Judy",
                "Dylan", "Theresa",
                "Ralph", "Madison",
                "Roy", "Beverly",
                "Alan", "Denise",
                "Wayne", "Marilyn",
                "Eugene", "Amber",
                "Juan", "Danielle",
                "Gabriel", "Rose",
                "Louis", "Brittany",
                "Russell", "Diana",
                "Randy", "Abigail",
                "Vincent", "Natalie",
                "Philip", "Jane",
                "Logan", "Lori",
                "Bobby", "Alexis",
                "Harry", "Tiffany",
                "Johnny", "Kayla"};
        System.out.println("Names count : " + names.length);

        System.out.println(Arrays.toString(names));

        int sarahIndex = -1;
        //loop through the names and find out where us "Sarah"
        for (int n = 0; n < names.length; n++) {
            if (names[n].equals("Sarah")) {
                sarahIndex = n;
                break;
            }
        }
        System.out.println("sarahIndex = " + sarahIndex);
        /*
        MALES NAMES:James, John....
        FEMALES NAMES: Mary, Patricia...
         */
        System.out.println("MALES NAMES");
        for (int i = 0; i < names.length; i += 2) {
            System.out.println(names[i] + ", ");

        }
        System.out.println();
        System.out.println("FEMALE NAMES");
        for (int i = 1; i < names.length; i += 2) {
            System.out.println(names[i] + ", ");
        }
        System.out.println();

        String maleNames = "";
        String femaleNames = "";

        for (int i = 0; i < names.length; i++) {
            if (i % 2 == 0) {
                maleNames += names[i] + ", ";
            } else {
                femaleNames += names[i] + ", ";
            }
        }
        System.out.println("MALE NAMES:" + maleNames);
        System.out.println("FEMALE NAMES:" + femaleNames);

        //check if "David" is among maleNames

        if (maleNames.contains("David")) {
            System.out.println("David is in the list");
        } else {
            System.out.println("David is not in the list");
        }
        //check if "Susan" is among femaleNames
        // if(femaleNames.contains("Susan")){
        if (femaleNames.contains("Susan")) {
            System.out.println("Susan is in the list");
        } else {
            System.out.println("Susan is not in the list");
        }
        String longestName = "";
        String shortestName = names[0];

        for (int i = 0; i < names.length; i++) {
            if(names[i].length() > longestName.length()){
                longestName = names[i];
            }

            if(names[i].length() < shortestName.length()){
                shortestName = names[i];
            }
        }
        System.out.println("longestName = " + longestName);
        System.out.println("shortestName = " + shortestName);




    }
}