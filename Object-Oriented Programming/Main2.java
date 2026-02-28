class Rectangle{
    int width;
    int height;

    int calculateArea(){
        return width*height;
    }


    void setDimensions(int width,int height){
        this.width=width;
        this.height=height;
    }
}





public class Main2 {
    public static void main(String[] args){
        Rectangle myRectangle=new Rectangle();

        myRectangle.setDimensions(5, 10);
        int area=myRectangle.calculateArea();
        System.out.println("Rectangle area: "+area);
    }
    
}



// calculateArea() is a method that calculates and returns the area of the rectangle.
// setDimensions() is a method that sets the width and height of the rectangle. It takes two integer parameters.

