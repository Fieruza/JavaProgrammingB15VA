package day08_if_statements;

public class CheckPincode {
    public static void main (String[] args){

        // check if inputPincode matches the secret one.
        //If match: Welcome to Your Account,you can withdraw,deposit, view balances
        //if not match: Invalid pincode! Access Denied!

        System.out.println("Welcome to Wells Fargo");
        int secretPincode= 2345;
        int inputPincode=2345;
        //always put parenthesis after "if"!!
        if (inputPincode==secretPincode){
            System.out.println("Welcome to your account!");
            System.out.println("You can withdraw,deposit, view balances");
        }else{
            System.out.println("Invalid pincode");
            System.out.println("Access denied!");
        }
        System.out.println("Thank you for your business! Bye");

    }
}
