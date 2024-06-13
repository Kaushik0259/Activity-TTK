package com.ttk;


import java.util.ArrayList;
import java.util.List;

// Class representing an order in the kitchen
public class Order {
    // List to store dishes in the order
    private List<Dish> dishes;
    
    // Constructor to initialize Order object
    public Order() {
        dishes = new ArrayList<>();
    }
    
    // Method to add dish to the order
    public void addDish(Dish dish) {
        dishes.add(dish);
    }
    
    // Method to calculate the total price of the order
    public double calculateTotal() {
        double total = 0;
        for (Dish dish : dishes) {
            total += dish.getPrice();
        }
        return total;
    }
    
    // Method to display the order details
    public void displayOrder() {
        System.out.println("Order Details:");
        for (Dish dish : dishes) {
            System.out.println(dish);
        }
        System.out.println("Total Price: $" + calculateTotal());
    }
}

