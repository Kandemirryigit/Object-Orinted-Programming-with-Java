class Person{
    String name;
    int age;

    // Constructor
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    void displayDetails(){
        System.out.println("Name:"+name+" Age:"+age);
    }

}



public class Main3 {
    public static void main(String[] args){
        Person john=new Person("John Doe",20);
        john.displayDetails();
    }
    
}



// Person(String name, int age) is a constructor that takes two parameters: name and age.
// this.name = name; and this.age = age; initialize the object's name and age attributes with the values passed as arguments to the constructor.