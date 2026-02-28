import java.util.Scanner;

public class MadLibsGame {
    public static void main(String[] args){
        Scanner takeInput=new Scanner(System.in);

        System.out.print("Enter an adjective (description): ");
        String adjective1=takeInput.nextLine();

        System.out.print("Enter a noun (animal or person): ");
        String noun=takeInput.nextLine();

        System.out.print("Enter an adjective (description): ");
        String adjective2=takeInput.nextLine();

        System.out.print("Enter a verb end with -ing (action): ");
        String verb=takeInput.nextLine();

        System.out.print("Enter an adjective (description): ");
        String adjective3=takeInput.nextLine();


        System.out.printf("\n\n\n\nToday I went to a %s zoo.\n",adjective1);
        System.out.printf("In an exhibit, I saw a %s\n",noun);
        System.out.printf("%s was %s and %s\n",noun,adjective2,verb);
        System.out.printf("I was %s\n",adjective3);


    }
    
}
