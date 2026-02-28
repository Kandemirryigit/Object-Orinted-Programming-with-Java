
// The default constructor is a constructor that takes no arguments
// It initializes the object with default values for its fields (e.g., 0 for int, null for objects, false for boolean).



class Dog{
    String name;
    int age;

    // Default constructor
    public Dog(){
        name="Unknown";
        age=0;
        System.out.println("Default constructor called");
    }

    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    public static void main(String[] args){
        Dog myDog=new Dog();   // Calls the default constructor
        myDog.displayDetails();
    }
}


// The Dog class has a default constructor Dog().
// Inside the constructor, name is initialized to "Unknown" and age is initialized to 0.
// When new Dog() is called, the default constructor is executed, and the object is initialized accordingly.

