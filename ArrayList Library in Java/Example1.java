import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args){
        ArrayList<String> names=new ArrayList<>();

        names.add("Yigit");
        names.add("Ahmet");
        names.add("Mehmet");

        for(String name:names){
            System.out.println(name);
        }

    }

    
}
