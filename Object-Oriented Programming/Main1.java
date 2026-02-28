class Car{
    public String model;
    private int speed;

    public void setSpeed(int speed){
        if(speed>=0 && speed<=200){
            this.speed=speed;
        }else{
            System.out.println("Invalid speed value");
        }
    }


    public int getSpeed(){
        return speed;
    }

}




public class Main1 {
    public static void main(String[] args){
        Car myCar=new Car();
        myCar.model="Tesla Model 3";   // Accessing public attribute
        // myCar.speed = 100; // This would cause an error if speed was public, but it's private so we can't access it directly

        myCar.setSpeed(100);  // Accessing speed through a public method
        System.out.println("Car speed: "+myCar.getSpeed());
    }
    
}





// model is public, so it can be accessed directly from Main1.
// speed is private, so it can only be accessed through the setSpeed() and getSpeed() methods
// This is an example of encapsulation, which protects the data and allows you to control how it's accessed and modified
// The setSpeed() method also demonstrates data validation, ensuring that the speed is within a valid range.


