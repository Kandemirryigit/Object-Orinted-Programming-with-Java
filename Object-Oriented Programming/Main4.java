class Book{
    String title;
    String author;
    String isbn;

    // Constructor 1: Title and Author
    public Book(String title,String author){
        this.title=title;
        this.author=author;
        this.isbn="Unknown"; // Default value
    }


    // Constructor 2: Title,Author and isbn
    public Book(String title,String author,String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }


    void displayDetails(){
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }


}



public class Main4 {
    public static void main(String[] args){
        Book book1=new Book("The Lord of the Rings", "J.R.R. Tolkien");
        Book book2=new Book("Pride and Prejudice", "Jane Austen", "978-0141439518");

        book1.displayDetails();  // Output: Title: The Lord of the Rings, Author: J.R.R. Tolkien, ISBN: Unknown
        book2.displayDetails();  // Output: Title: Pride and Prejudice, Author: Jane Austen, ISBN: 978-0141439518
    }
    
}




// The Book class has two constructors: one that takes the title and author, and another that takes the title, author, and ISBN.
// The Main class creates two Book objects, using different constructors.
