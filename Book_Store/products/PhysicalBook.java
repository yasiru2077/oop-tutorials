package Book_Store.products;

public class PhysicalBook extends Book {
    private String coverType;


    public PhysicalBook(String title, String isbn, double price, int yearPublished, String publisher, String author, int pageCount, String coverType) {
        super(title, isbn, price, yearPublished, publisher, author, pageCount);
        this.coverType = coverType;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    @Override
    public String getProductType() {
        return "Physical Book";
    }

    @Override
    public String getDeliveryInfo() {
        return "Shipping in 2-5 business days";
    }
}
