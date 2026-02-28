abstract class Vehicle {

    private String driverName;
    protected double baseFare;

    public Vehicle(String driverName,double baseFare){
        this.driverName=driverName;
        this.baseFare=baseFare;
    }

    public String getDriverName(){
        return driverName;
    }

    public abstract double calculateFare(double distance);
    
}
