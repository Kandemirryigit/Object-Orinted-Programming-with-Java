import java.util.Scanner;

public class WhileLoopInputExample{
    public static void main(String[] args){
        Scanner takeInput=new Scanner(System.in);

        int number=0;

        while(number!=-1){
            System.out.print("Enter a number: ");
            number=takeInput.nextInt();

            if(number!=-1){
                System.out.println("You entered: "+number);
            }
        }

        System.out.println("Exiting...");
        takeInput.close();
        
    }
}