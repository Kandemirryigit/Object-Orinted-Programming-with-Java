class LiveCourse extends Course {

    public LiveCourse(String title,double price){
        super(title,price);
    }

    @Override
    public double calculateFinalPrice(){
        return price+50;
    }
    
}
