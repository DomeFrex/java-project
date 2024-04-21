package classes;
public class ClothingProduct extends Product{

  String size;
  String fabric;

  public void setSize(String size) {
    this.size = size;
  }
  public void setFabric(String fabric) {
    this.fabric = fabric;
  }
  public String getSize() {
    return size;
  }
  public String getFabric() {
    return fabric;
  }
  public  ClothingProduct(String name, int id, float price, String size, String fabric) {
    setName(name);
    setPrice(price);
    setProductId(id);
    setSize(size);
    setFabric(fabric);
  }
}
