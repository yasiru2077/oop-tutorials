package Book_Store;

public class Customer {

 private String name;
 private String email;
 private final String customerId;
 private boolean isPremium;

 private static int idCounter = 1000;

 public Customer(String name, String email, boolean isPremium) {
  this.name = name;
  this.email = email;
  this.isPremium = isPremium;

  this.customerId = generateCustomerId();

 }

 public Customer(String name,String email){
  this(name,email,false);
 }

 private static String generateCustomerId() {
  idCounter++;
  return "CUST-" + idCounter;
 }

 public boolean wantsFreeShipping(){
  return isPremium;
 }

 public String getName() {
  return name;
 }

 public String getEmail() {
  return email;
 }

 public String getCustomerId() {
  return customerId;
 }

 public boolean isPremium() {
  return isPremium;
 }

 public void setName(String name) {
  this.name = name;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 public void setPremium(boolean premium) {
  isPremium = premium;
 }


 @Override
 public String toString() {
  return "Customer{" +
          "name='" + name + '\'' +
          ", email='" + email + '\'' +
          ", customerId='" + customerId + '\'' +
          ", isPremium=" + isPremium +
          '}';
 }


}
