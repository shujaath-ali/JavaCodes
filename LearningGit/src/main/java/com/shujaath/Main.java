package com.shujaath;

import com.shujaath.Controller.Product;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("We are practicing Hello world program");
        List<Product> products = new ArrayList<>();

        // Adding products to the list
        products.add(new Product("Laptop", 1500L, "Dell"));
        products.add(new Product("Smartphone", 800L, "Apple"));
        products.add(new Product("Headphones", 150L, "Sony"));

        // Iterating over the list to print only the names of the products
        for (Product product : products) {
            System.out.println(product.getName());
        }
    }
}