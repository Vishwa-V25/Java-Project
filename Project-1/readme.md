# 🛒 Shopping Cart System (Java)

A simple, interactive, and beginner-friendly **Java Shopping Cart Project** that simulates an online store with festival discounts, dynamic billing, and real-time purchase summary.  
This is one of my first Java projects — built to practice OOP, collections, and console-based applications.

---

## 🚀 Project Overview

This Java console application allows users to:

- Select products using product IDs  
- Add multiple items to a virtual shopping cart  
- Automatically apply festival-specific discount offers  
- View a complete purchase summary  
- Get the final billing amount with discount breakdown  

It demonstrates core concepts of **Object-Oriented Programming**, **HashMaps**, **ArrayLists**, **user input handling**, and **practical billing logic**.

---

## 🔧 Features

### ✔ Product Management  
- Predefined product list (Laptop, Mobile, Charger, etc.)  
- Add items to cart using simple numeric IDs  

### ✔ Festival Offer Engine  
Automatically applies discounts when:
- Purchase date matches an active festival  
- Minimum amount criteria is satisfied  

Supported Festivals:
- Diwali  
- Pongal  
- Christmas  
- Onam  
- Ugadi  
- Bakrid  

### ✔ Interactive Billing System  
- Displays all purchased items  
- Total price before discount  
- Festival discount details (name, % and amount)  
- Final payable price  

### ✔ Clean Console Workflow  
- Informative messages  
- Error handling for invalid product IDs  
- Attractive summary sections  

---

## 📁 Smaple Output
=== Welcome to Online Store ===
Enter Purchase Date and Product IDs
Purchase Date Received: 26.12.2025
Added to Cart: Headphones | Price: ₹1200.0
Added to Cart: Headphones | Price: ₹1200.0
Added to Cart: Keyboard | Price: ₹800.0
Added to Cart: Laptop | Price: ₹50000.0

=== PURCHASE SUMMARY ===
Items Bought:

Headphones (₹1200.0)

Headphones (₹1200.0)

Keyboard (₹800.0)

Laptop (₹50000.0)
Total Price Before Discount: ₹53200.0

Checking for applicable festival offers...
Festival 'Christmas' is active on your purchase date.

=== FESTIVAL DISCOUNT APPLIED ===
Festival Name: Christmas
Discount Percentage: 10%
Discount Amount: ₹5320.0
Final Price After Discount: ₹47880.0

=== THANK YOU FOR SHOPPING WITH US! ===
