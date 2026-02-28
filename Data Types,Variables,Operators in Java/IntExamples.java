public class IntExamples{
    static void main(String[] args){

        // Declaring and initializing an int variable
        int age=30;
        System.out.println("Age: "+age);

        // Using int for counting
        int numberOfStudents=150;
        System.out.println("Number of students: "+numberOfStudents);

        // Demonstrating the range of int
        int maxIntValue=Integer.MAX_VALUE;
        int minIntValue=Integer.MIN_VALUE;
        System.out.println("Max int value: "+maxIntValue);
        System.out.println(("Min int value: "+minIntValue));

        // What happens when we exceed the maximum value? (Integer Overflow)
        int overflowedValue = maxIntValue + 1;
        System.out.println("Overflowed value: " + overflowedValue); 

        // What happens when we go below the minimum value? (Integer Underflow)
        int underflowedValue = minIntValue - 1;
        System.out.println("Underflowed value: " + underflowedValue);


    }
} 