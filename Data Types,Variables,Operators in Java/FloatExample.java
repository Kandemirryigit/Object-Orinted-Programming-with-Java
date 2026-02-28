public class FloatExample{
    static void main(String[] args){
        
        // Declaring and initializing a float variable
        float price=19.99f;
        System.out.println("Price: "+price);
        
        
        // Using float for representing measurements
        float temperature = 25.5f;
        System.out.println("Temperature: " + temperature);

        // Demonstrating precision limitations
        float largeFloat = 123456789.123456789f;
        System.out.println("Large float: " + largeFloat);


        // Division resulting in a float
        float result = 10.0f / 3.0f;
        System.out.println("Result of division: " + result);
    }
}