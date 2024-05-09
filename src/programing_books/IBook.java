package programing_books;

import java.util.List;

public interface IBook {
    public  void addBook(Book b);
    public List<Book> listAllBooks();
    public Book search(String title,String authorName);
}
