class Employee{
    String name;
    int id;

    public Employee(String name,int id){
        this.name=name;  // 'this.name' refers to the attribute, 'name' refers to the parameter
        this.id=id;   // 'this.id' refers to the attribute, 'id' refers to the parameter
    }


    void displayDetails(){
        System.out.println("Name:"+this.name+" ,Id:"+this.id);
    }


}


public class Main5 {
    public static void main(String[] args){
        Employee employee1=new Employee("Alice Smith",101);
        employee1.displayDetails();
    }
    
}
