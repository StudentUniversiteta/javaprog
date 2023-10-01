package ru.mirea.lab4.three;

import java.util.*;

enum Category {
    ELECTRONICS, CLOTHING, GROCERY;
}

class Product {
    String name;
    double price;

    Category category;

    Product(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
}

class User {
    String username;
    String password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

class ShoppingCart {
    List<Product> products;

    ShoppingCart() {
        products = new ArrayList<>();
    }

    void addProduct(Product product) {
        products.add(product);
    }

    double checkout() {
        double sum = 0;
        for (Product prod : products) {
            sum += prod.price;
        }
        products.clear();
        return sum;
    }
}

class Store {

    Map<String, User> users;
    List<Product> products;

    Store() {
        users = new HashMap<>();
        products = new ArrayList<>();
    }

    void addUser(User user) {
        users.put(user.username, user);
    }

    User authenticate(String username, String password) {
        User user = users.get(username);
        if (user != null && user.password.equals(password)) {
            return user;
        }
        return null;
    }

    void addProduct(Product product) {
        products.add(product);
    }

    List<Product> getProducts() {
        return products;
    }
}