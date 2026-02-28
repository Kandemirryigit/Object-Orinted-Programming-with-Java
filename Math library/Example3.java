// Find a circle's circumference and area

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args){
        Scanner takeInput=new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius=takeInput.nextDouble();

        double circumference=2*Math.PI*radius;
        double area=Math.PI*Math.pow(radius,2);

        System.out.println("The circumference is: "+circumference);
        System.out.println("The area is: "+area);


    }
    
}
