package programing_books;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.List;

public class BookClient {
    public static void main(String[] args) {
        Book b = new Book("B0001", "Thinking in Java", "Bruce eckel", "Programming", 5, 650);
        Book b2 = new Book("B0002", "XML Learning", "Bill Gates", "Programming", 10, 750);
        Book b3 = new Book("B0003", "Design Patterns using Java", "Duke", "Programming", 10, 650);

        BookDAOFactory proxy = new BookDAOFactory();
        IBook book = proxy.createInstance();

        book.addBook(b);
        book.addBook(b2);
        book.addBook(b3);

        List<Book> listOfBooks = book.listAllBooks();
        System.out.println("Listing All Books");

        for(Book t:listOfBooks){
            System.out.println("The Book \t" + t.getTitle() + " written by \t" + t.getAuthorName() + " and the type of book is \t"+ t.getCategory() +" the price of the book is \t" + t.getPrice());
        }

        Book bookFound = book.search("XML Learning" , "Bill Gates");
        if(bookFound == null ){
            System.out.println("Book not found");
        } else {
            System.out.println("Book found!!");
        }
    }
}
