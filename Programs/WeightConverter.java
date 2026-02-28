import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args){
        Scanner takeInput=new Scanner(System.in);

        System.out.println("Weight Conversion Program");
        System.out.println("\n1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        System.out.print("Choose an option: ");
        int choice=takeInput.nextInt();

        if(choice==1){
            System.out.print("Enter the weight in lbs: ");
            double weightLbs=takeInput.nextDouble();
            double kgs=weightLbs*0.453592;
            System.out.printf("%.2f lbs is %.2f kgs",weightLbs,kgs);
        }
        else if(choice==2){
            System.out.print("Enter the weight in kgs: ");
            double weightKgs=takeInput.nextDouble();
            double lbs=weightKgs*2.20462;
            System.out.printf("%.2f kgs is %.2f lbs",weightKgs,lbs);

        }
        else{
            System.out.print("Wrong choice.");
        }


        takeInput.close();

    }
    
}
