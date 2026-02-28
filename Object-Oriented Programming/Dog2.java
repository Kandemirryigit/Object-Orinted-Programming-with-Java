public class Dog2 {
    private String name;
    private int age;

    public Dog2(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void bark(){
        System.out.println("Woof! My name is " + this.name + " and I am " + this.age + " years old.");
    }

    public static void main(String[] args){
        Dog2 myDog=new Dog2("Buddy",3);
        myDog.bark();

    }
    
}
