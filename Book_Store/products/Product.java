package Book_Store.products;

public abstract class Product {
    private String title;
    private String isbn;
    private double price;
    private int yearPublished;
    protected String publisher;
    final String STORE_NAME = "ByteRead Bookstore";

    public Product(String title, String isbn, double price, int yearPublished, String publisher) {
        this.title = title;
        this.isbn = isbn;
        this.price = price;
        this.yearPublished = yearPublished;
        this.publisher = publisher;
    }

    public abstract String getProductType();
    public abstract String getDeliveryInfo();

    public void displayBasicInfo(){
        System.out.println("title:"+title+" ,isbn:"+isbn+" ,price:"+price+", year"+yearPublished+", publisher"+publisher);
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


}
