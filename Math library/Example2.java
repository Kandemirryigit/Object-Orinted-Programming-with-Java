// Find hypotenuse


import java.util.Scanner;

public class Example2 {
    public static void main(String[] args){
        Scanner takeInput=new Scanner(System.in);

        System.out.print("Enter the length of side A: ");
        double a=takeInput.nextDouble();

        System.out.print("Enter the length of side B: ");
        double b=takeInput.nextDouble();

        double c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));

        System.out.printf("The hypotenuse (side c) is: %.2f",c);


        
        takeInput.close();


    }
    
}
