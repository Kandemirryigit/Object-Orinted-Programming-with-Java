import java.util.ArrayList;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args){
        Scanner takeInput=new Scanner(System.in);
        ArrayList<String> cities=new ArrayList<>();

        System.out.print("how many cities do you want to enter: ");
        int count=takeInput.nextInt();


        for(int i=0;i<=count;i++){
            System.out.print("Enter city name: ");
            String city=takeInput.nextLine();
            cities.add(city);
        }


        System.out.println("\nYour cities: ");
        for(String city:cities){
            System.out.println(city);
        }


        takeInput.close();



    }

    
}
