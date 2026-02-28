class Car {

    private Engine engine;
    private Driver driver;

    public Car(Engine engine,Driver driver){
        this.engine=engine;
        this.driver=driver;
    }

    public void startJourney(){
        engine.start();
        driver.drive();
        System.out.println("Car is moving...");
    }
    
}
