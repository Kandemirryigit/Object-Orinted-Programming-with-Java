class VideoCourse extends Course {

    public VideoCourse(String title,double price){
        super(title,price);
    }

    @Override
    public double calculateFinalPrice(){
        return price * 0.9;
    }
    
}
