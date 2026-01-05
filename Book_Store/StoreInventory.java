package Book_Store;

import Book_Store.products.Product;

import java.util.ArrayList;
import java.util.List;

public class StoreInventory {

    private List<Product> avaliableProducts;
    static int MAX_PRODUCTS = 100;

    public void addProduct(Product p) {

        if ( avaliableProducts.size() < MAX_PRODUCTS ) {
            avaliableProducts.add(p);
        } else {
            System.out.println("Inventory in full");
        }

    }

    public Product findProductByIsbn(String isbn){
        if (isbn == null || isbn.trim().isEmpty()){
            return null;
        }

        for (Product product:avaliableProducts){
            if (isbn.equals(product.getIsbn())){
                return product;
            }
        }
        return null;
    }

    public void showAllProducts(){
        System.out.println("\n=== All Products in Store ===\n");
        for (Product product:avaliableProducts){
            product.displayBasicInfo();
            System.out.println("Type: " + product.getProductType());
            System.out.println("Delivery: " + product.getDeliveryInfo());
            System.out.println("-------------------");

        }

    }

    public List<Product> getAvaliableProducts(){
        return new ArrayList<>(avaliableProducts);
    }


}
