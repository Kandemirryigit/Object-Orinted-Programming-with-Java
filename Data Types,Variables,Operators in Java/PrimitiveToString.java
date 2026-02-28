public class PrimitiveToString {
    public static void main(String[] args){
        int intValue=123;
        String intString=String.valueOf(intValue);
        System.out.println("Int string: "+intString);  // Output: Int string: 123


        double doubleValue=45.67;
        String doubleString=String.valueOf(doubleValue);
        System.out.println("Double string: "+doubleString);  // Output: Double string: 45.67


        boolean booleanValue=true;
        String booleanString=String.valueOf(booleanValue);
        System.out.println("Boolean string: "+booleanString);  // Output: Boolean string: true


        long longValue = 9876543210L;
        String longString = String.valueOf(longValue);
        System.out.println("Long string: " + longString); // Output: Long string: 9876543210


        float floatValue = 3.14f;
        String floatString = String.valueOf(floatValue);
        System.out.println("Float string: " + floatString); // Output: Float string: 3.14

    }
}



// String.valueOf(): Converts a primitive data type to a string.
// Integer.toString(): Converts an Integer object to a string.
// Double.toString(): Converts a Double object to a string.
// Boolean.toString(): Converts a Boolean object to a string.
// Long.toString(): Converts a Long object to a string.
// Float.toString(): Converts a Float object to a string.