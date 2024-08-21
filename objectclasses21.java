public class objectclasses21 {
    public static void main(String[] args) {
        // program to define objects and create classes
        //creating a new book object from a book class
        Book myBook= new Book();
        // setting attributes for the book object
        myBook.title="A Tale of Two Cities";
        myBook.author="Charles Dickens";
        myBook.pages=448;
        //using the methods
        myBook.read();
        myBook.close();
        //displaying the attributes of the book
        System.out.println("The title of the book: "+myBook.title);
        System.out.println("The author of the book: "+myBook.author);
        System.out.println("Number of pages: "+myBook.pages);
    }  
}
class Book {
    //attributes
    String title;
    String author;
    int pages;

    //method to show the book is being read
    void read(){
        System.out.println("The book is being read.");
    }
    //method to close the book
    void close(){
        System.out.println("The book is closed.");
    }
}