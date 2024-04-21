package classes;
public class Customer {
  String name;
  String address;
  int customerId;
  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getCustomerId() {
    return customerId;
  }
  public String getAddress() {
    return address;
  }
  public String getName() {
    return name;
  }
  public Customer(String name, String address, int customerId)  {
    setName(name);
    setAddress(address);
    setCustomerId(customerId);
  }
}
