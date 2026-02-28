public class BooleanExamples{
    static void main(String[] args){

        // Declaring and initializing boolean variables
        boolean isJavaFun = true;
        boolean isFishMammal = false;
        System.out.println("Is Java fun? " + isJavaFun); 
        System.out.println("Is fish a mammal? " + isFishMammal);


        // Using boolean in conditional statements 
        if (isJavaFun) {
            System.out.println("Let's learn Java!"); 
        } else {
            System.out.println("Maybe try something else.");
        }


        // Boolean results from comparisons
        int x = 10;
        int y = 5;
        boolean isXGreaterThanY = x > y;
        System.out.println("Is x greater than y? " + isXGreaterThanY);
    }
}