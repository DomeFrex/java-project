package classes;
public class ElectronicProduct extends Product{
  String brand;
  int warrantyPeriod;
  public void setBrand(String brand) {
    this.brand = brand;
  }
  public void setWarrantyPeriod(int warrantyPeriod) {
    this.warrantyPeriod = warrantyPeriod;
  }
  public String getBrand() {
    return brand;
  }
  public int getWarrantyPeriod() {
    return warrantyPeriod;
  }

 public  ElectronicProduct(String name, int id, float price, String brand, int warrantyPeriod) {
    setName(name);
    setProductId(id);
    setPrice(price);
    setBrand(brand);
    setWarrantyPeriod(warrantyPeriod);

  } 
}
