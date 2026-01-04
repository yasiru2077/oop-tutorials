package Book_Store.products;

public abstract class Book extends Product {

    private String author;
    private int pageCount;

    public Book(String title, String isbn, double price, int yearPublished, String publisher, String author, int pageCount) {
        super(title, isbn, price, yearPublished, publisher);
        this.author = author;
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
