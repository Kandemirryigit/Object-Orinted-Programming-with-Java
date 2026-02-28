import java.util.ArrayList;

class Student{
    String name;
    int age;
    double gpa;

    public Student(String name,int age,double gpa){
        this.name=name;
        this.age=age;
        this.gpa=gpa;
    }

    public void display(){
         System.out.printf("Name:%s Age:%d gpa:%.2f\n",name,age,gpa);

    }


}



public class Example6 {
    public static void main(String[] args){
        ArrayList<Student> students=new ArrayList<>();

        students.add(new Student("Yiğit",19,3.5));
        students.add(new Student("Ahmet",20,2.9));
        students.add(new Student("Mehmet",18,3.8));

        for(Student s:students){
            s.display();
        }


    }

    
}
