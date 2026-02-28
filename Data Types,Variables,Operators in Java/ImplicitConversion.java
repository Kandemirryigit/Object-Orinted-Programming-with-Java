public class ImplicitConversion {
    public static void main(String[] args){
        int intValue=100;
        long longValue=intValue;   // Implicit conversion from int to long
        System.out.println("Long value: "+longValue);   // Output: Long value: 100


        float floatValue=longValue;  // Implicit conversion from long to float
        System.out.println("Float Value: "+floatValue);  // Output: Float value: 100.0

        
        double doubleValue=floatValue;   // Implicit conversion from float to double
        System.out.println("Double value: "+doubleValue);   // Output: Double value: 100.0


        byte byteValue=50;
        short shortValue=byteValue;   // Implicit conversion from byte to short
        System.out.println("Short value: "+shortValue);   // Output: Short value: 50


        char charValue='A';
        int intFromChar=charValue;  // Implicit conversion from char to int (ASCII value)
        System.out.println("Int from char: "+intFromChar);   // Output: Int from char: 65
          

    }
    
}
