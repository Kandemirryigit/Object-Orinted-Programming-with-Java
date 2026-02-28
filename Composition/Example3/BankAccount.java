class BankAccount {

    private String owner;
    private double balance;
    private Card card;   // BankAccount HAS-A Card

    public BankAccount(String owner,double balance,Card card){
        this.owner=owner;
        this.balance=balance;
        this.card=card;
    }


    public void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
            card.pay(amount);  // using Card object
        }
        else{
            System.out.println("Not enough balance");
        }
    }


    public double getBalance(){
        return balance;
    }
    
}
