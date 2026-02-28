class CarRide extends Vehicle {

    public CarRide(String driverName){
        super(driverName,5.0);
    }

    @Override
    public double calculateFare(double distance){
        return baseFare + (distance*2);
    }


    
}
