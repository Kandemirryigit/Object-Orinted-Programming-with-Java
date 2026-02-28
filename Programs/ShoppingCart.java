import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args){
        Scanner takeInput=new Scanner(System.in);

        System.out.print("What item would you like to buy: ");
        String item=takeInput.nextLine();

        System.out.print("What is the price for each: ");
        double price=takeInput.nextDouble();

        System.out.print("How many would you like: ");
        int count=takeInput.nextInt();

        double totalPrice=price*count; 

        System.out.printf("\n\n\nYou have bought %d %s/s\n",count,item);
        System.out.printf("Your total is $%.2f",totalPrice);

    }
    
}
