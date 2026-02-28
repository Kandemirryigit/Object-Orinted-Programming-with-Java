import java.util.ArrayList;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> tasks=new ArrayList<>();

        while(true){
            System.out.println("\n1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Show Tasks");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            int choice=scanner.nextInt();
            scanner.nextLine();  // Clear Buffer

            if(choice==1){
                System.out.print("Enter task to add: ");
                String task=scanner.nextLine();
                tasks.add(task);
                System.out.println("Task added.");
            }

            else if(choice==2){
                System.out.print("Enter task index to remove: ");
                int index=scanner.nextInt();
                if(index>=0 && index<tasks.size()){
                    tasks.remove(index);
                    System.out.println("Task removed");
                }
                else{
                    System.out.println("Invalid index.");
                }
            }

            else if(choice==3){
                System.out.println("Your Tasks:");
                for(int i=0;i<tasks.size();i++){
                    System.out.println(i+1 + " - " + tasks.get(i));
                }
            }

            else if (choice == 4) {
                break;
            }


        }

        scanner.close();

    }

    
}
