import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args){
        Scanner takeInput=new Scanner(System.in);

        System.out.println("1- Convert C to F");
        System.out.println("2- Convert F to C");
        System.out.print("Choose one of them: ");
        int choice=takeInput.nextInt();

        if(choice==1){
            System.out.print("Enter tempature (C): ");
            double celciusInput=takeInput.nextDouble();

            double celciusconvertedtoFahrenait=(celciusInput*9/5)+32;
            System.out.printf("%.2f C degree equals %.2f F degree",celciusInput,celciusconvertedtoFahrenait);
        }
        else if(choice==2){
            System.out.print("Enter tempature (F): ");
            double fahrenhaitInput=takeInput.nextDouble();

            double fahrenhaitConvertedToCelcius=(fahrenhaitInput-32)*(5.0/9.0);
            System.out.printf("%.2f F degree equals %.2f c degree",fahrenhaitInput,fahrenhaitConvertedToCelcius);
        }
        else{
            System.out.println("Wrong input");
        }
        

    }
    
}
