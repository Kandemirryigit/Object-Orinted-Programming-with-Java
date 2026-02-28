import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner takeInput=new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1=takeInput.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator=takeInput.next().charAt(0);

        System.out.print("Enter second number: ");
        double number2=takeInput.nextDouble();

        double result=0.0;

        switch(operator){
            case '+':
                result=number1+number2;
                break;
            case '-':
                result=number1-number2;
                break;
            case '*':
                result=number1*number2;
                break;
            case '/':
                if(number2!=0)
                {
                    result=number1/number2;
                }
                else{
                    System.out.println("Cannot divide by zero");
                    return;
                }
                break;
            default:
                System.out.println("Invalid Operator");
                return;
        }

        System.out.println("Result: "+ result);
        takeInput.close();

    
    }
}