public class Bus {
    private String color;
    private String model;

    public Bus setColor(String color){
        this.color=color;
        return this;  // Return the current Bus object
    }

    public Bus setModel(String model){
        this.model=model;
        return this;  // Return the current Bus object
    }

    public void display(){
        System.out.println("Bus Model: " + model + ", Color: " + color);
    }

    public static void main(String[] args){
        Bus myBus=new Bus();
        myBus.setColor("Red").setModel("Travego").display();
    }
    
}
