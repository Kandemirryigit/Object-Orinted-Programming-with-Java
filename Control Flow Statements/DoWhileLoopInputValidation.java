import java.util.Scanner;

public class DoWhileLoopInputValidation{
    public static void main(String[] args){
        Scanner takeInput=new Scanner(System.in);

        int age;

        do{
            System.out.print("Enter your age: ");
            age=takeInput.nextInt();

            if(age<0 || age>120){
                System.out.println("Invalid age. Please enter a value between 0 and 120.");

            }
        }while(age<0 || age>120);

        System.out.println("You entered a valid age: " + age);
        takeInput.close();
       
    }
}