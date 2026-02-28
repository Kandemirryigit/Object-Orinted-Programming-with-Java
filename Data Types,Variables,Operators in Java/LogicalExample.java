public class LogicalExample {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("a && b: " + (a && b)); // Output: false
        System.out.println("a || b: " + (a || b)); // Output: true
        System.out.println("!a: " + (!a));         // Output: false
        System.out.println("a & b: " + (a & b));   // Output: false
        System.out.println("a | b: " + (a | b));   // Output: true
        System.out.println("a ^ b: " + (a ^ b));   // Output: true
    }
}