package classes;
public class Product {
  int productId;
  float price;
  String name;

  public void setName(String name) {
      this.name = name;
  }
  public void setPrice(float price) {
      this.price = price;
  }
  public void setProductId(int productId) {
      this.productId = productId;
  }
  public String getName() {
      return name;
  }
  public float getPrice() {
      return price;
  }
  public int getProductId() {
      return productId;
  }
} 
