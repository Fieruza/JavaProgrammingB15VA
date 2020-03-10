package day40_custom_classes;

public class Bank {
    public static void main(String[] args) {
        //create an account
        CheckingAccount clientOne = new CheckingAccount();
        //set data
        clientOne.accountNumber = 123456789L;
        clientOne.accountHolder = "Wooden Spoon";
        clientOne.balance = 500.0;

        System.out.println(clientOne.accountNumber);
        //call getAccountInfo method
        clientOne.getAccountInfo();

        //create another account and set data using a method
        CheckingAccount clientTwo = new CheckingAccount();
        clientTwo.setInfo(300.0, 123456789L, "Barack Obama");
        clientTwo.getAccountInfo();
//test deposit method
        clientOne.deposit(300.0);
        clientOne.getAccountInfo();
        clientTwo.deposit(1000.0);
        clientTwo.getAccountInfo();
//test withdraw method
        clientOne.withdraw(100.0);
        clientOne.getAccountInfo();
        clientTwo.withdraw(500.0);
        clientTwo.getAccountInfo();

        //call purchase method
         CheckingAccount myAccount = new CheckingAccount();
         myAccount.setInfo(200, 12345679L,"Master Muhtar");
         myAccount.purchases("book", 98);
         myAccount.purchases("shoes",120.0);
         myAccount.purchases("tire", 450);

         //balance is -538

        System.out.println("Coded lots of java, and landed a SDET job");
        System.out.println("First month salary is direct deposited");

        myAccount.deposit(10000);
        myAccount.getAccountInfo();
    }
}
