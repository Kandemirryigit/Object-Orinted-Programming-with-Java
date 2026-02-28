public class Main {
    public static void main(String[] args){

        Course[] courses={
            new VideoCourse("Java Basics",200),
            new LiveCourse("Advanced Java",300)
        };

        for(Course c:courses){
            System.out.printf("%s---> Final price: $%.2f\n",c.getTitle(),c.calculateFinalPrice());
        }



    }
    
}
