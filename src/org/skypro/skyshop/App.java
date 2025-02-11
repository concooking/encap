package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {

    public static void main(String[] args) {
        Product[] products = new Product[5];
        ProductBasket basket = new ProductBasket(products);
        basket.addProductBasket(new Product("Мука", 150));
        basket.addProductBasket(new Product("Яйцо", 110));
        basket.addProductBasket(new Product("Хлеб", 60));
        basket.addProductBasket(new Product("Колбаса", 550));
        basket.addProductBasket(new Product("Сахар", 50));
        System.out.println(basket.totalCostBasket());
        basket.printContentBasket();
        System.out.println(basket.searchProductByName("Мука"));
        basket.clearBasket();
        basket.printContentBasket();
    }
}
