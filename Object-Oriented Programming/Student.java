class Student {
    String name;
    int studentId;
    String major;
    double gpa;

    // Default constructor
    public Student(){
        this("Unknown",0,"Unknown",0.0);
        System.out.println("Default Student constructor called");
    }


    // Parameterized constructor with name and studentId
    public Student(String name,int studentId){
        this(name,studentId,"Undecided",0.0);
        System.out.println("Parameterized Student constructor (name, studentId) called");
    }

    
    // Parameterized constructor with name, studentId, and major
    public Student(String name, int studentId, String major) {
        this(name, studentId, major, 0.0);
        System.out.println("Parameterized Student constructor (name, studentId, major) called");
    }


    // Parameterized constructor with all attributes
    public Student(String name,int studentId,String major,double gpa){
        this.name=name;
        this.studentId=studentId;
        this.major=major;
        this.gpa=gpa;
        System.out.println("Parameterized Student constructor (all attributes) called");
    }


    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
    }



    public static void main(String[] args){
        Student s1=new Student();
        s1.displayDetails();

        Student s2=new Student("Alice Smith", 12345);
        s2.displayDetails();

        Student s3=new Student("Bob Johnson", 67890, "Computer Science");
        s3.displayDetails();

        Student s4=new Student("Charlie Brown", 13579, "Engineering", 3.75);
        s4.displayDetails();
    }




    
}
