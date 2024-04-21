import classes.*;
import java.lang.Math;
import java.util.Scanner;
public class EcommerceSystem{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your name");
    String name = scanner.nextLine();
    System.out.println("Enter your customer id");
    int customerId =  Integer.valueOf(scanner.nextLine());
    System.out.println("Enter address");
    String address = scanner.nextLine();
    Customer customer = new Customer(name, address, customerId);
    Product smartphone = new ElectronicProduct("Smartphone", 42, 599.99f, "Samsung", 1);
    Product bookOOP = new BookProduct("OOP",3 , 39.99f, "O'Reilly", "X publications");
    Product cottonShirt= new ClothingProduct("T-shirt", 2, 19.99f, "Medium", "Cottton");
    System.out.println("How many products do you want?");
    int nProducts =  Integer.valueOf(scanner.nextLine());
    Cart cart = new Cart(customerId , nProducts);
    //------------------------------------------------
    for (int i = 0; i < nProducts; i++) {
      System.out.println("Which product would you like to add? 1- Smartphone 2- T-Shirt 3- OOP");
      int choice = Integer.valueOf(scanner.nextLine());
      if (choice == 1) {
        cart.addProduct(i,smartphone);
      }
      else if (choice == 2) {
        cart.addProduct(i, cottonShirt);
      }
      else if (choice ==3) {
        cart.addProduct(i, bookOOP);
      }
      else {
        System.out.println("Invlid product");
        i--;
      }
    }
    System.out.println("Your total is " + cart.calculatePrice() + ", Would you like to place order? 1- Yes 2- No");
    int choice = Integer.valueOf(scanner.nextLine());
    if (choice == 1) {

      Order order1 = new Order(customer.getCustomerId(), 1 , cart.products, cart.calculatePrice());
      order1.printOrderInfo();
    }else {
      // in the project example this case was not talked about, but there is a fully working remove function just in case. 
    }
  }
}

