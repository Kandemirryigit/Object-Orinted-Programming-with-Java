public class Main {
    public static void main(String[] args){
        Engine engine=new Engine();
        Driver driver=new Driver("Yigit");

        Car car=new Car(engine,driver);
        car.startJourney();
        
    }
    
}
