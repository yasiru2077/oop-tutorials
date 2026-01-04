package Book_Store.products;

public class EBook extends Book {
    private double fileSizeMB;

    public EBook(String title, String isbn, double price, int yearPublished, String publisher, String author, int pageCount, double fileSizeMB) {
        super(title, isbn, price, yearPublished, publisher, author, pageCount);
        this.fileSizeMB = fileSizeMB;
    }


    public double getFileSizeMB() {
        return fileSizeMB;
    }

    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }

    @Override
    public String getProductType() {
        return null;
    }
}
