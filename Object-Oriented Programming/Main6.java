class Rectangle2{
    public int width;
    public int height;

    // Method to calculate the area of the rectangle
    public int calculateArea(){
        return width*height;
    }
}

public class Main6 {
    public static void main(String[] args){
        Rectangle2 myRectangle2=new Rectangle2();

        myRectangle2.width=10;
        myRectangle2.height=6;
        int area=myRectangle2.calculateArea();
        System.out.println("Area of the rectangle: " + area);
    }
    
}



// The Rectangle class has two public attributes: width and height.
// The calculateArea() method calculates the area of the rectangle
// In the main method, we create a Rectangle object, set its width and height, and then calculate and print its area
