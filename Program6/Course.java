abstract class Course {

    private String title;
    protected double price;

    public Course(String title,double price){
        this.title=title;
        this.price=price;
    }

    public String getTitle(){
        return title;
    }

    public abstract double calculateFinalPrice();

}
