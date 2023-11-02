package ru.mirea.lab4_Case_Inheritance.three;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.addUser(new User("a", "a"));
        store.addProduct(new Product("Cell Phone", 15000.0, Category.ELECTRONICS));
        store.addProduct(new Product("T-Shirt", 400.0, Category.CLOTHING));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя: ");
        String username = scanner.nextLine();
        System.out.println("Введите пароль: ");
        String password = scanner.nextLine();

        User user = store.authenticate(username, password);
        if (user == null) {
            System.out.println("Неверное имя пользователя или пароль");
            return;
        }

        ShoppingCart cart = new ShoppingCart();
        while (true) {
            double sum = 0;
            System.out.println("Список продуктов:");
            List<Product> products = store.getProducts();
            for (int i = 0; i < products.size(); i++) {
                System.out.println((i + 1) + ". " + products.get(i).name + "\tКатегория " + products.get(i).category);
            }
            System.out.println("Введите номер продукта для добавления в корзину или 'checkout' для оплаты:");
            String input = scanner.nextLine();
            if (input.equals("checkout")) {
                sum = cart.checkout();
                System.out.print("Покупка совершена. Списано ");
                System.out.print(sum);

                break;
            } else {
                int productIndex = Integer.parseInt(input) - 1;
                cart.addProduct(products.get(productIndex));
                System.out.println("Продукт добавлен в корзину");
            }
        }
    }
}