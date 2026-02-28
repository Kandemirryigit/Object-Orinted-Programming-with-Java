public class CombinedOperators {
    public static void main(String[] args) {
        int age = 25;
        boolean isStudent = true;
        // Check if a person is eligible for a discount (age under 18 or is a student)
        boolean eligibleForDiscount = (age < 18) || isStudent;
        System.out.println("Eligible for discount: " + eligibleForDiscount); // Output: true
        // Check if a person is an adult and not a student
        boolean isAdultAndNotStudent = (age >= 18) && !isStudent;
        System.out.println("Is adult and not student: " + isAdultAndNotStudent); // Output: false
    }
}