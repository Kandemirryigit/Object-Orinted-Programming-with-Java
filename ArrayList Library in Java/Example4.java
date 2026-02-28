import java.util.ArrayList;

public class Example4 {
    public static void main(String[] args){
        ArrayList<String> fruits=new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        fruits.remove("Banana");

        System.out.println(fruits);
    }
}
