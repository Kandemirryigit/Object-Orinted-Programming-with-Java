class Car {

    private Engine engine;  // Car HAS an Engine

    public Car(){
        engine=new Engine();  // create engine inside car
    }

    public void startCar(){
        engine.start();  // use engine's method
        System.out.println("Car is moving");

    }
    
}
