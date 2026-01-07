package Book_Store;

import Book_Store.products.Product;

import java.util.ArrayList;
import java.util.List;

public class StoreInventory {

    private List<Product> availableProducts;
     public static final int MAX_PRODUCTS = 100;

    public StoreInventory(){
        this.availableProducts = new ArrayList<>();
    }

    public void addProduct(Product p) {

        if ( availableProducts.size() < MAX_PRODUCTS ) {
            availableProducts.add(p);
        } else {
            System.out.println("Inventory in full");
        }

    }

    public Product findProductByIsbn(String isbn){
        if (isbn == null || isbn.trim().isEmpty()){
            return null;
        }

        for (Product product:availableProducts){
            if (isbn.equals(product.getIsbn())){
                return product;
            }
        }
        return null;
    }

    public void showAllProducts(){
        System.out.println("\n=== All Products in Store ===\n");
        for (Product product:availableProducts){
            product.displayBasicInfo();
            System.out.println("Type: " + product.getProductType());
            System.out.println("Delivery: " + product.getDeliveryInfo());
            System.out.println("-------------------");

        }

    }

    public List<Product> getAvailableProducts(){
        return new ArrayList<>(availableProducts);
    }


}
