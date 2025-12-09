🛒 Festival Discount Billing System – Java
A simple and interactive Java console application that simulates an online shopping system with automatic festival discount detection.
  
The user enters a purchase date and product IDs, and the program:
Displays all purchased items
Calculates total price
Identifies active festivals on that date
Checks minimum purchase requirements
Applies the correct festival discount
Shows the final payable amount
Festivals like Diwali, Pongal, Christmas, Onam, Ugadi, Bakrid are preconfigured with their own date ranges, discounts, and minimum purchase limits.

Perfect for learning:
HashMaps
Date comparison logic
OOP (classes for Product & Festival)
User input handling
Clean console output

  _________________________________________________________________________________________________________________________________________________________________________________________________________________

import java.util.*;
class Festival {
    String name;
    String startDate;
    String endDate;
    int discountPercent;
    double minAmount;
    public Festival(String name, String startDate, String endDate, int discountPercent, double minAmount) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.discountPercent = discountPercent;
        this.minAmount = minAmount;
    }
    private int convertToInt(String date) {
        String[] p = date.split("\\.");
        return Integer.parseInt(p[2] + p[1] + p[0]);
    }
    public boolean isFestivalDay(String date) {
        int d = convertToInt(date);
        return d >= convertToInt(startDate) && d <= convertToInt(endDate);
    }
}
class Product {
    int id;
    String name;
    double price;
    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Welcome to Online Store ===");
        System.out.println("Enter Purchase Date and Product IDs");
        Festival[] festivals = {
            new Festival("Diwali", "20.10.2025", "30.10.2025", 99, 1500),
            new Festival("Pongal", "10.01.2025", "17.01.2025", 15, 1000),
            new Festival("Christmas", "20.12.2025", "26.12.2025", 10, 800),
            new Festival("Onam", "12.12.2012", "12.12.2013", 100, 1),
            new Festival("Ugadi", "2.2.2000", "12.12.2002", 100, 1),
            new Festival("Bakrid", "12.12.2004", "12.12.2005", 100, 1)
        };
        Map<Integer, Product> store = new HashMap<>();
        store.put(1, new Product(1, "Laptop", 50000));
        store.put(2, new Product(2, "Keyboard", 800));
        store.put(3, new Product(3, "Headphones", 1200));
        store.put(4, new Product(4, "Mobile", 20000));
        store.put(5, new Product(5, "Charger", 5000));
        store.put(6, new Product(6, "Television", 700));
        store.put(7, new Product(5, "radio", 9300));
        store.put(8, new Product(5, "iphone", 5100));
        store.put(9, new Product(5, "airpods", 7500));
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) {
            return;
        }
        String purchaseDate = sc.next();
        System.out.println("Purchase Date Received: " + purchaseDate);
        double total = 0;
        ArrayList<String> purchasedItems = new ArrayList<>();
        while (sc.hasNextInt()) {
            int id = sc.nextInt();
            if (id == 0) {
                break;
            }
            if (store.containsKey(id)) {
                Product p = store.get(id);
                total += p.price;
                purchasedItems.add(p.name + " (₹" + p.price + ")");
                System.out.println("Added to Cart: " + p.name + " | Price: ₹" + p.price);
            } else {
                System.out.println("Invalid Product ID: " + id);
            }
        }
        System.out.println("\n=== PURCHASE SUMMARY ===");
        System.out.println("Items Bought: " + (purchasedItems.isEmpty() ? "None" : ""));
        for (String s : purchasedItems) {
            System.out.println(" - " + s);
        }
        System.out.println("Total Price Before Discount: ₹" + total);
        Festival applied = null;
        System.out.println("\nChecking for applicable festival offers...");
        for (Festival f : festivals) {
            if (f.isFestivalDay(purchaseDate)) {
                System.out.println("Festival '" + f.name + "' is active on your purchase date.");
                if (total >= f.minAmount) {
                    applied = f;
                    break;
                } else {
                    System.out.println("Minimum amount not reached for " + f.name + " discount. Required: ₹" + f.minAmount);
                }
            }
        }
        if (applied != null) {
            double discount = total * applied.discountPercent / 100;
            System.out.println("\n=== FESTIVAL DISCOUNT APPLIED ===");
            System.out.println("Festival Name: " + applied.name);
            System.out.println("Discount Percentage: " + applied.discountPercent + "%");
            System.out.println("Discount Amount: ₹" + discount);
            System.out.println("Final Price After Discount: ₹" + (total - discount));
        } else {
            System.out.println("\nNo festival discount applicable.");
            System.out.println("Final Price: ₹" + total);
        }
        System.out.println("\n=== THANK YOU FOR SHOPPING WITH US! ===");
    }
}
