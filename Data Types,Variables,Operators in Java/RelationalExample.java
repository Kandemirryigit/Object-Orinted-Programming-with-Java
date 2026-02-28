public class RelationalExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("a == b: " + (a == b)); // Output: false
        System.out.println("a != b: " + (a != b)); // Output: true
        System.out.println("a > b: " + (a > b));   // Output: false
        System.out.println("a < b: " + (a < b));   // Output: true
        System.out.println("a >= b: " + (a >= b)); // Output: false
        System.out.println("a <= b: " + (a <= b)); // Output: true
        boolean isEqual = (a == 5);
        System.out.println("isEqual: " + isEqual); // Output: true
    }
}