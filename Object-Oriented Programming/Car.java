class Car {
    String model;
    String color;
    int year;

    // Parameterized constructor
    public Car(String modelName,String carColor,int modelYear){
        model=modelName;
        color=carColor;
        year=modelYear;
        System.out.println("Parameterized constructor called");
    }

    public void displayDetails(){
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args){
        Car myCar=new Car("Tesla Model 3","white",2024);
        myCar.displayDetails();
    }
    
}
