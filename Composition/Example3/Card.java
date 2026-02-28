class Card {

    private String cardNumber;
    private String cardHolder;

    public Card(String cardNumber,String cardHolder){
        this.cardNumber=cardNumber;
        this.cardHolder=cardHolder;
    }

    public void pay(double amount){
        System.out.printf("%s paid $%.2f using card %s\n",cardHolder,amount,cardNumber);
    }



    
}
