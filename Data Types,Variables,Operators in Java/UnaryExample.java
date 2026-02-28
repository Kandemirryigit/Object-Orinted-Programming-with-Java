public class UnaryExample {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Original value of a: " + a);    // Output: 5
        System.out.println("Unary plus: " + (+a));            // Output: 5 (no change)
        System.out.println("Unary minus: " + (-a));           // Output: -5
        System.out.println("Post-increment: " + (a++));       // Output: 5 (a is incremented after the value is used)
        System.out.println("Value of a after post-increment: " + a); // Output: 6
        System.out.println("Pre-decrement: " + (--a));       // Output: 5 (a is decremented before the value is used)
    }
}


// The increment (++) and decrement (--) operators have different behaviors depending on whether they are used in prefix or postfix form
// When used as a prefix (e.g., ++a), the value of a is incremented before it is used in the expression
// When used as a postfix (e.g., a++), the value of a is incremented after it is used in the expression.