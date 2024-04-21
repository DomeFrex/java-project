package classes;
public class Order { 
  int customerId;
  int orderId;
  Product[] products; 
  float totalPrice;
  public Order(int customerId, int orderId, Product[] products, float totalPrice) {
    this.customerId = customerId;
    this.orderId = orderId;
    this.products = products;
    this.totalPrice = totalPrice;

  }

  public void printOrderInfo() {
    
    System.out.println("Here's your order's summary: ");
    System.out.println("Order ID: " + orderId);
    System.out.println("Customer ID: " + customerId);
    System.out.println("Products: ");
    for (int i = 0; i < products.length ; i++) {
      System.out.println(products[i].name +  " - " + products[i].price);
    }
    System.out.println("Total price: " + totalPrice);

    
  }
}
