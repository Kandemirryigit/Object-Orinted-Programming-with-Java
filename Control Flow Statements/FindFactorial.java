import java.util.Scanner;

public class FindFactorial{
    public static void main(String[] args){
        int result=1;
        Scanner takeInput=new Scanner(System.in);

        System.out.print("which number's factorial do you want to find: ");
        int number=takeInput.nextInt();

        if(number<0){
            System.out.println("We cannot make this operation because the number is lower than zero");
            return;
        }
        else if(number==0 || number==1){
            System.out.println("The result is: 1");
            return;
        }
        else{
            for(int i=1;i<=number;i++){
                result*=i;
            }
        }

        System.out.println("The result is: "+result);
        takeInput.close();


    }
}