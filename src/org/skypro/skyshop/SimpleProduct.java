package org.skypro.skyshop;

import org.skypro.skyshop.product.Product;

public class SimpleProduct extends Product {
    private int price;

    public SimpleProduct(String product, int price) {
        super(product);
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {

        return String.format("%s: %s", getNameProduct(), price);
    }

    @Override
    public boolean isSpecial() {
        return false;
    }
}
