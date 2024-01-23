public class Shirt {
    public int shirtID = 5; 
    public String description = "Унікальна сорочка"; 
    public String colorCode = "unset";
    public double price = 15.0;
    public int quantityInStock = 10; 
    

    public void displayShirtInformation() {
      System.out.println("Shirt ID: " + shirtID);
      System.out.println("Shirt description:" + description);
      System.out.println("Color Code: " + colorCode);
      System.out.println("Shirt price: $" + price);
      System.out.println("Quantity in stock: " + quantityInStock);
    } 
  } 