package programing_books;

import java.util.ArrayList;
import java.util.List;

public class BookDAOImp implements IBook{

    private  List<Book> listOfBooks = new ArrayList<>();

    @Override
    public void addBook(Book b) {
        listOfBooks.add(b);
    }

    @Override
    public List<Book> listAllBooks() {
        return listOfBooks;
    }

    @Override
    public Book search(String title, String authorName) {
        Book isBookFound = null;

        for (Book b:listOfBooks){
            if (title.equals(b.getTitle()) && authorName.equals(b.getAuthorName())){
                isBookFound=b;
            }
        }
        return isBookFound;
    }
}
