public class CharExamples{
    static void main(String[] args){

        // Declaring and initializing char variables
        char initial = 'J';
        char grade = 'A';
        char currencySymbol = '$';

        System.out.println("Initial: " + initial); 
        System.out.println("Grade: " + grade); 
        System.out.println("Currency symbol: " + currencySymbol); 


        // Using Unicode escape sequences
        char copyrightSymbol = '\u00A9'; // Unicode for copyright symbol
        System.out.println("Copyright symbol: " + copyrightSymbol);


        // Representing numbers as characters
        char numberChar = '7'; 
        System.out.println("Number character: " + numberChar); 

        // Characters can be treated as integers (ASCII/Unicode values)
        int charAsInt = initial; 
        System.out.println("Character as integer: " + charAsInt);  

    }
} 