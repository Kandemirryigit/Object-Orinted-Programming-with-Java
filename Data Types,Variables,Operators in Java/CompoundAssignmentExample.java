public class CompoundAssignmentExample {
    public static void main(String[] args) {
        int a = 10;
        a += 5; // a = a + 5
        System.out.println("a += 5: " + a); // Output: 15
        a -= 3; // a = a - 3
        System.out.println("a -= 3: " + a); // Output: 12
        a *= 2; // a = a * 2
        System.out.println("a *= 2: " + a); // Output: 24
        a /= 4; // a = a / 4
        System.out.println("a /= 4: " + a); // Output: 6
        a %= 2; // a = a % 2
        System.out.println("a %= 2: " + a); // Output: 0
    }
}