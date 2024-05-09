package programing_books;

public class Book {
    private String id;
    private String title;
    private String authorName;
    private String category;
    private int qty;
    private float price;

    Book(String id , String title , String authorName , String category , int qty , float price ){
        this.id = id;
        this.title = title;
        this.authorName = authorName;
        this.category = category;
        this.qty = qty;
        this.price = price;
    }

    public String getId(){
        return title;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getCategory() {
        return category;
    }

    public int getQty() {
        return qty;
    }

    public float getPrice() {
        return price;
    }
}
