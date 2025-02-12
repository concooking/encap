package org.skypro.skyshop;

import org.skypro.skyshop.product.Product;

public class SimpleProduct extends Product {
    private int price;

    public SimpleProduct(String product, int price) {
        super(product);
        this.price = price;

    }

    @Override
    public int getBasePricePrice() {
        return 0;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
