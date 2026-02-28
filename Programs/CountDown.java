import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) throws InterruptedException {
        Scanner takeInput=new Scanner(System.in);

        System.out.print("How many seconds to countdown from: ");
        int seconds=takeInput.nextInt();

        for(int i=seconds;i>0;i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("HAPPY NEW YEAR");

    }
    
}
