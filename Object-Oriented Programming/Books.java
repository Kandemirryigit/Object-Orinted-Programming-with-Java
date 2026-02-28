public class Books {
    String title;
    String author;
    int publicationYear;


    // Deafult constructor
    public Books(){
        title="Unknown";
        author="Unknown";
        publicationYear=0;
        System.out.println("Default constructor called");
    }


    // Parameterized constructor with title and author
    public Books(String bookTitle,String bookAuthor){
        title=bookTitle;
        author=bookAuthor;
        publicationYear=0;
        System.out.println("Parameterized constructor (title, author) called");
    }


    // Parameterized constructor with title, author, and publication year
    public Books(String bookTitle,String bookAuthor,int year){
        title=bookTitle;
        author=bookAuthor;
        publicationYear=year;
        System.out.println("Parameterized constructor (title, author, year) called");
    }


    public void displayDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
    }


    public static void main(String[] args){
        Books book1=new Books();  // Calls the default constructor
        book1.displayDetails();

        Books book2=new Books("The Lord of the Rings", "J.R.R. Tolkien");  // Calls the constructor with title and author
        book2.displayDetails();

        Books book3=new Books("Pride and Prejudice", "Jane Austen", 1813);  // Calls the constructor with title, author, and year
        book3.displayDetails();
    }
    
}
