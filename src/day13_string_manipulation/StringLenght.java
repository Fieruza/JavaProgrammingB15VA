package day13_string_manipulation;

public class StringLenght {
    public static void main(String[] args) {
        String school = "Cybertek School";
        //print number of characters
        System.out.println(school.length());
        //store school length into a int variable -count
        int count = school.length();
        //Cybertek School is 15 characters
        System.out.println(school + " is " + count + " characters");


        String firsName = "Feruz";
        String lastName = "Tedla";
        //count total numeber of character for your full name and assign to variable
        int fullNameCount = firsName.length() + lastName.length();
        System.out.println(fullNameCount);

        String password = "cybertek123";
        //check if the password is more than 8 character
        //if yes, "Password lenght matches requirement"
        //if not "Password is too short, needs to be minimum 8 character"

        if (password.length() > 8){ ;
        System.out.println("Password length matches requirement");
    }else{
            System.out.println("Password is too short, needs to be minimum 8 character");
            //assign to int variable pLenght and check if it 8-16 character
            int pLength= password.length();
            if(pLength>=8 && pLength<=10) {
                System.out.println("Password length matches requirement");
            }else{
                System.out.println("Password length does not matches requirement");
            }
    }


    }
}
