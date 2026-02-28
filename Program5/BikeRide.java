class BikeRide extends Vehicle {

    public BikeRide(String driverName){
        super(driverName,3.0);
    }
    
    @Override
    public double calculateFare(double distance){
        return baseFare + (distance*1);
    }
}
