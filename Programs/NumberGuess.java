import java.util.Scanner;
import java.util.Random;

public class NumberGuess {
    public static void main(String[] args){
        Scanner takeInput=new Scanner(System.in);
        Random random=new Random();

        int randomNumber=random.nextInt(1,101);
        int tryTimes=5;
        
        

        do{
            System.out.println("\nGuess a number between 1-100");
            System.out.print("Guess: ");
            int guessNumber=takeInput.nextInt();

            if(guessNumber>randomNumber){
                tryTimes--;
                if(tryTimes==0){
                    System.out.printf("You lost the game.The number was %d",randomNumber);
                }
                else{
                     System.out.println("your guess is Higher than the number");
                    System.out.printf("You have %d attempts left\n",tryTimes);
                }
               
            }
            else if(randomNumber>guessNumber){
                tryTimes--;
                if(tryTimes==0){
                    System.out.printf("You lost the game.The number was %d",randomNumber);
                }
                else{
                    System.out.println("your guess is Lower than the number");
                    System.out.printf("You have %d attempts left\n",tryTimes);
                }
                
            }
            else{
                System.out.printf("Congrulations you found it.The number was %d",randomNumber);
                tryTimes=0;
            }

        

        }while(tryTimes!=0);

        







    }
    
}
