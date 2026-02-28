public class Main {
    public static void main(String[] args){

        Vehicle[] rides={
            new CarRide("Ali"),
            new BikeRide("Ayşe")
        };

        for(Vehicle v:rides){
            double fare=v.calculateFare(10);
            System.out.printf("%s---> fare: $%.2f\n",v.getDriverName(),fare);
        }
    }
    
}
