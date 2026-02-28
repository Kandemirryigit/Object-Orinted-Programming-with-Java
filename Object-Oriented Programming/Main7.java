class BankAccount{
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber,String accountHolderName){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=0.0;  // Initial balance is 0
    }


    public String getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposit of " + amount + " successful. New balance: " + balance); 
        }else{
            System.out.println("Invalid deposit amount");
        }
    }


    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdrawal of " + amount + " successful. New balance: " + balance);
        }else{
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }


}






public class Main7 {
    public static void main(String[] args){
        BankAccount myAccount=new BankAccount("1234567890", "John Doe");
        System.out.println("Account Number: "+myAccount.getAccountNumber());
        System.out.println("Account Holder Name: "+myAccount.getAccountHolderName());
        System.out.println("Initial Balnce: "+myAccount.getBalance());

        myAccount.deposit(1000.0);
        myAccount.withdraw(500.0);

        System.out.println("Final Balance: "+myAccount.getBalance());
    }
    
}
