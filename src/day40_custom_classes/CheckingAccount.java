package day40_custom_classes;

public class CheckingAccount {
    double balance;
    long accountNumber;
    String accountHolder;
    String type = "checking";

    public void setInfo (double pBalance, long pAccountNumber, String pAccHolder){
        balance = pBalance;
        accountNumber = pAccountNumber;
        accountHolder = pAccHolder;

    }
    public void getAccountInfo(){
        System.out.println("Checking Account: $"+balance+","+
                accountNumber+","+accountHolder);
    }
    public void deposit(double amount){
        System.out.println("depositing $"+amount+" to account number: "+ accountNumber);
        balance += amount;
    }
    public void withdraw (double amount){
        System.out.println("withdrawing $"+amount+ " from account number: "+accountNumber);
        if(amount <= balance){
            balance -= amount;
        }else{
            System.out.println("ERROR: InsufficientFundsException. Keep coding java");
        }
    }
    public void purchases (String item, double price){
        System.out.println("purchasing "+item+ " for $"+price);
        if(price <= balance){
            System.out.println("transaction successful for "+item);
            balance -= price;
        }else{
            System.out.println("InsufficientFundsException - Overdraft fee is applied");
            balance -= (price+35);
            //balance -= 35;
            System.out.println("transaction completed for "+item+ ", current balance: "+ balance);

        }
    }
}
