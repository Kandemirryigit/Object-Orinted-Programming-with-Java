public class ExplicitConversion {
    public static void main(String[] args){

        double doubleValue=19.99;
        int intValue=(int) doubleValue;  // Explicit conversion from double to int
        System.out.println("Int Value: "+intValue);  // Output: Int value: 19 (decimal part is truncated)


        long longValue=200L;
        int intValueFromLong=(int) longValue;  // Explicit conversion from long to int
        System.out.println("Int from long: "+intValueFromLong);  // Output: Int from long: 200


        float floatValue=150.5f;
        byte byteValue=(byte) floatValue;  // Explicit conversion from float to byte
        System.out.println("Byte Value: "+byteValue);  // Output: Byte value: -106 (due to overflow and underflow)


        int largeIntValue=130;
        byte byteValueFromInt=(byte) largeIntValue;  // Explicit conversion from int to byte
        System.out.println("Byte from int: "+byteValueFromInt);  // Output: Byte from int: -126 (due to overflow)


        short shortValue=1000;
        byte byteValueFromShort=(byte) shortValue;  // Explicit conversion from short to byte
        System.out.println("Byte from short: "+byteValueFromShort);  // Output: Byte from short: -24 (due to overflow)



    }
    
}
