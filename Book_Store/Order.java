package Book_Store;


import Book_Store.products.Product;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String orderId;
    private Customer customer;
    private List<Product> items;
    private double totalPrice;

    public Order(String orderId, Customer customer, double totalPrice,List<Product> items) {
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
        return items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setItems(List<Product> items) {
        this.items = items;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    private double calculateTotal(){

        double sum = 0;
        for (Product p:items){
            sum += p.getPrice();
        }
        return  sum;

    }

    public void showOrderSummary() {
        System.out.println("Order Summary:");
        for (Product product : items) {
            product.getProductType();
            product.displayBasicInfo();
        }
    }


}
