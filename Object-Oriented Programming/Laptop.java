public class Laptop {
    String model;
    String brand;
    int ram;

    // Parameterized constructor using 'this' keyword
    public Laptop(String model,String brand,int ram){
        this.model=model;
        this.brand=brand;
        this.ram=ram;
        System.out.println("Parameterized constructor with 'this' called");
    }

    public void displayDetails(){
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + " GB");
    }


    public static void main(String[] args){
        Laptop myLaptop=new Laptop("MacBook Pro", "Apple", 16);
        myLaptop.displayDetails();
    }
    
}
