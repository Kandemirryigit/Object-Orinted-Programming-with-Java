import java.util.Scanner;

public class DoWhileLoopMenuExample{
    public static void main(String[] args){
       Scanner takeInput=new Scanner(System.in);
       int choice;

       do{
        System.out.println("Menu: ");
        System.out.println("1-Option1");
        System.out.println("2-Option2");
        System.out.println("3-Exit");
        System.out.print("Enter your choice: ");
        choice=takeInput.nextInt();

        switch(choice){
            case 1:
                System.out.println("You chose option1");
                break;
            case 2:
                System.out.println("Yopu chose option2");
                break;
            case 3:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid input");
        }

       }while(choice!=3);

       takeInput.close();
       
       
    }
}