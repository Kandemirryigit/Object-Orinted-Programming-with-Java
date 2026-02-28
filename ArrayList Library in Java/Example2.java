import java.util.ArrayList;

public class Example2 {
    public static void main(String[] args){
        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        for(int number:numbers){
            if(number%2==0){
                System.out.println(number);
            }
        }
    }

    
}
