Завдання 1. (Додала лише один скріншот, ба на ньому видно, що програма бцла запущена 2 рази)

Скріншот:
! [](прооп1.jpg)

Код:
```java
public class Shirt {
    public int shirtID = 5; 
    public String description = "Унікальна сорочка"; 
    public char colorCode = 'G';
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
```
ЗМІНИ

2. Колір сорочки виводиться у вигляді рядка


Скріншот:
! [](прооп4.jpg)

Код:
```java
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
```
