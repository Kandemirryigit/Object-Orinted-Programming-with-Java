public class Main {
    public static void main(String[] args){
        Shape s1=new Circle(5);
        Shape s2=new Rectangle(4,6);

        System.out.println(s1.calculateArea());
        System.out.println(s2.calculateArea());

    }
    
}
