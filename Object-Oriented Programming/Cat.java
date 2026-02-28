class Cat {
    String name;
    int age;

    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    public static void main(String[] args){
        Cat myCat=new Cat();   // Calls the implicit default constructor
        myCat.displayDetails();  // Name: null, Age: 0
    }
    
}
