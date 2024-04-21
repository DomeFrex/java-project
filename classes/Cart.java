package classes;
public  class Cart {
  public int nProducts;
  public Product[] products;
  public int customerId;

  public Cart(int customerId, int nProducts) {
    setCustomerId(customerId);
    setnProducts(nProducts );
    products= new Product[nProducts];
  }


  public void addProduct(int index, Product addAProduct) {
    products[index] = addAProduct;
    
  }
  public float calculatePrice () {
    float total = 0f;
    for (int i = 0; i < nProducts; i++) {
      total = total + products[i].getPrice();
      
    }
    return total;
  }
  public void removeProduct(int index) {
     Product newProducts[] = new Product[(products.length - 1)];
    for (int i = index ; i < (products.length - 1); i++) {
      products[i] = products[i+1];
    }
    products[products.length - 1] = null;
    for (int i = 0; i < products.length - 1; i++) {
    newProducts[i] = products[i];
    }
    products = newProducts;
    }


  public void placeOrder() {
    
  }
  //setters and getters
  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }
  public void setnProducts(int nProducts) {
    this.nProducts = nProducts;
  }
  public void setProducts(Product[] products) {
    this.products = products;
  }
  public Product[] getProducts() {
      return products;
  }

  public int getCustomerId() {
    return customerId;
  }
  public int getnProducts() {
    return nProducts;
  }
}

