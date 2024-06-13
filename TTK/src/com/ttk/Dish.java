package com.ttk;


//Class representing a dish
public class Dish {
 // Name of the dish
 private String name;
 
 // Price of the dish
 private double price;
 
 // Constructor to initialize Dish object
 public Dish(String name, double price) {
     this.name = name;
     this.price = price;
 }
 
 // Getter method for name
 public String getName() {
     return name;
 }
 
 // Setter method for name
 public void setName(String name) {
     this.name = name;
 }
 
 // Getter method for price
 public double getPrice() {
     return price;
 }
 
 // Setter method for price
 public void setPrice(double price) {
     this.price = price;
 }
 
 // Overriding toString() method to display dish details
 @Override
 public String toString() {
     return "Dish{" +
             "name='" + name + '\'' +
             ", price=" + price +
             '}';
 }
}

