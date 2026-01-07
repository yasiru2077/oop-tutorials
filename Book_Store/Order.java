package Book_Store;


import Book_Store.products.Product;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String orderId;
    private Customer customer;
    private List<Product> items;
    private double totalPrice;

    public Order(String orderId, Customer customer,List<Product> items) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = new ArrayList<>(items);
        this.totalPrice = calculateTotal();
    }

    public String getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getItems() {
        return new ArrayList<>(items);
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    private double calculateTotal(){

        double sum = 0;
        for (Product p:items){
            sum += p.getPrice();
        }
        return  sum;

    }

    public void showOrderSummary() {
        System.out.println("\n══════════════════════════════════════════");
        System.out.println("          Order: " + orderId);
        System.out.println("Customer: " + customer.getName() +
                " (" + (customer.isPremium() ? "Premium" : "Regular") + ")");
        System.out.println("──────────────────────────────────────────");
        System.out.println("Items:");

        int index = 1;
        for (Product p : items) {
            System.out.printf("  %2d. %-30s (%-12s) $%6.2f%n",
                    index++, p.getTitle(), p.getProductType(), p.getPrice());

        }

        System.out.println("──────────────────────────────────────────");
        System.out.printf("Total: $%.2f%n", totalPrice);
        System.out.println("Delivery: " + getDeliveryInfo());
        System.out.println("Free Shipping: " + (customer.wantsFreeShipping() ? "YES" : "NO"));
        System.out.println("══════════════════════════════════════════");
    }

    private String getDeliveryInfo() {
        if (items.isEmpty()) return "No items";
        String deliveryInfo = "";
      for(Product p:items){
          deliveryInfo = p.getDeliveryInfo();
      }
      return deliveryInfo;
    }


}
