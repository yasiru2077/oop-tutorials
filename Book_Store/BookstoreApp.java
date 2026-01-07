package Book_Store;

import Book_Store.products.EBook;
import Book_Store.products.PhysicalBook;
import Book_Store.products.Product;

import java.util.ArrayList;
import java.util.List;

public class BookstoreApp {
    public static void main(String[] args) {
        StoreInventory inventory = new StoreInventory();

        Product[] products = {
                new EBook("The Witcher - Blood of Elves", "978-0316438988", 9.99, 2018, "Orbit", "Andrzej Sapkowski", 400, 2.8),
                new EBook("Clean Code", "978-0132350884", 34.99, 2008, "Prentice Hall", "Robert C. Martin", 431, 5.1),
                new PhysicalBook("Dune", "978-0441172719", 12.50, 1965, "Ace Books", "Frank Herbert", 896, "Paperback"),
                new PhysicalBook("The Name of the Wind", "978-0756404741", 18.99, 2007, "DAW", "Patrick Rothfuss", 662, "Hardcover"),
                new EBook("Java: The Complete Reference", "978-1260463415", 45.00, 2022, "McGraw-Hill", "Herbert Schildt", 1248, 18.7),
                new PhysicalBook("Project Hail Mary", "978-0593135204", 22.99, 2021, "Ballantine Books", "Andy Weir", 496, "Hardcover")
        };

        for (Product p : products) {
            inventory.addProduct(p);
        }

        inventory.showAllProducts();

        Customer alice = new Customer("Alice Smith", "alice@gmail.com", true);
        Customer bob = new Customer("Bob Johnson", "bob@outlook.com");

        System.out.println("\nCustomers created:");
        System.out.println(alice);
        System.out.println(bob);

        List<Product> aliceCart = new ArrayList<>();
        aliceCart.add(products[0]); // Witcher E-Book
        aliceCart.add(products[2]);

        List<Product> bobCart = new ArrayList<>();
        bobCart.add(products[1]);   // Clean Code E-Book
        bobCart.add(products[3]);   // Name of the Wind Physical
        bobCart.add(products[5]);

        Order order1 = new Order("ORD-001", alice, aliceCart);
        Order order2 = new Order("ORD-002", bob, bobCart);

        order1.showOrderSummary();
        order2.showOrderSummary();

        // 7. Bonus: demonstrate find by ISBN
        System.out.println("\nSearching for ISBN 978-0316438988...");
        Product found = inventory.findProductByIsbn("978-0316438988");
        if (found != null) {
            System.out.println("Found: " + found.getTitle() + " (" + found.getProductType() + ")");
        } else {
            System.out.println("Product not found.");
        }

    }
}
