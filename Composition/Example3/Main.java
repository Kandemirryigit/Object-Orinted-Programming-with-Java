public class Main {
    public static void main(String[] args){

        Card card=new Card("1234-5678","Yigit");
        BankAccount account=new BankAccount("Yigit",1000,card);
        
        account.withdraw(200);
        System.out.printf("Remaining balace: $%.2f",account.getBalance());


    }
    
}
