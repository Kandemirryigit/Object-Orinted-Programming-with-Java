public class StringToPrimitive {
    public static void main(String[] args){

        String intString="123";
        int intValue=Integer.parseInt(intString);
        System.out.println("Int value: "+intValue);  // Output: Int value: 123


        String doubleString="45.67";
        double doubleValue=Double.parseDouble(doubleString);
        System.out.println("Double value: "+doubleValue);  // Output: Double value: 45.67


        String booleanString="true";
        boolean booleanValue=Boolean.parseBoolean(booleanString);
        System.out.println("Boolean value: "+booleanValue);  // Output: Boolean value: true


        String longString="9876543210";
        long longValue=Long.parseLong(longString);
        System.out.println("Long value: "+longValue);  // Output: Long value: 9876543210


        String floatString="3.14f";
        float floatValue=Float.parseFloat(floatString);
        System.out.println("Float value: "+floatValue);  // Output: Float value: 3.14


    }
}



// Integer.parseInt(): Converts a string to an int.
// Double.parseDouble(): Converts a string to a double
// Boolean.parseBoolean(): Converts a string to a boolean.
// Long.parseLong(): Converts a string to a long.
// Float.parseFloat(): Converts a string to a float.


