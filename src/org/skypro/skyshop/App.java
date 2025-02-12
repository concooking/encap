package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {

    public static void main(String[] args) {
        Product[] products = new Product[5];
        ProductBasket basket = new ProductBasket(products);
        basket.addProductBasket(new SimpleProduct("Мука", 150));
        basket.addProductBasket(new SimpleProduct("Яйцо", 110));
        basket.addProductBasket(new SimpleProduct("Хлеб", 60));
        basket.addProductBasket(new SimpleProduct("Колбаса", 550));
        basket.addProductBasket(new SimpleProduct("Сахар", 50));
        System.out.println(basket.totalCostBasket());
        basket.printContentBasket();
        System.out.println(basket.searchProductByName("Мука"));
        basket.clearBasket();
        basket.printContentBasket();
        DiscountedProduct product;
        product = new DiscountedProduct("Вода", 110,20);
        product.printPrice();
        product.printDiscountPrice();
        FixPriceProduct product1 = new FixPriceProduct("Яблоко");
        FixPriceProduct product2 = new FixPriceProduct("Лимон");
        };
}