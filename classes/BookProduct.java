package classes;
public class BookProduct extends Product{
  String author;
  String publisher;
  public void setAuthor(String author) {
    this.author = author;
  }
  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }
  public String getAuthor() {
    return author;
  }
  public String getPublisher() {
    return publisher;
  }
  public BookProduct(String name, int id, float price,  String author, String publisher) {
    setName(name);
    setProductId(id);
    setPrice(price);
    setAuthor(author);
    setPublisher(publisher);
  }
}

