package com.ttk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Main class to simulate TastyTales Kitchen
public class TTK {
    // Method to display available dishes
    public static void displayMenu(List<Dish> menu) {
        System.out.println("Available Dishes:");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i + 1) + ". " + menu.get(i).getName() + " - $" + menu.get(i).getPrice());
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        // Creating a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Predefined list of available dishes
        List<Dish> menu = new ArrayList<>();
        menu.add(new Dish("Spaghetti", 500));
        menu.add(new Dish("Grilled Chicken", 700));
        menu.add(new Dish("salad", 400));
        menu.add(new Dish("Beef Tacos", 350));
        
        // Creating an Order object
        Order order = new Order();
        
        // Variable to control the loop
        boolean ordering = true;
        
        // Loop to take multiple dish orders
        while (ordering) {
            // Displaying the menu to the user
            displayMenu(menu);
            
            // Asking user to select a dish
            System.out.println("Select a dish by number:");
            int choice = scanner.nextInt();
            
            // Validating user choice
            if (choice > 0 && choice <= menu.size()) {
                // Adding selected dish to the order
                order.addDish(menu.get(choice - 1));
            } else {
                System.out.println("Invalid choice, please try again.");
                continue; // Skip to the next iteration
            }
            
            // Asking user if they want to add another dish
            System.out.println("Do you want to add another dish? (yes/no)");
            scanner.nextLine(); // Consume newline
            String response = scanner.nextLine();
            
            // Checking user response to continue or stop ordering
            if (response.equalsIgnoreCase("no")) {
                ordering = false;
            }
        }
        
        // Displaying the final order details
        order.displayOrder();
        
        // Closing the scanner
        scanner.close();
    }
}
