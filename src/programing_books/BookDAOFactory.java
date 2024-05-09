package programing_books;
public class BookDAOFactory {
    public IBook createInstance(){
        return new BookDAOImp();
    }
}
