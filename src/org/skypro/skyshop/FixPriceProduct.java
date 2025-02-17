package org.skypro.skyshop;

import org.skypro.skyshop.product.Product;

public class FixPriceProduct extends Product {
    final int FIX_PRICE_PRODUCT;

    public FixPriceProduct(String productName, int FIX_PRICE_PRODUCT) {
        super(productName);
        this.FIX_PRICE_PRODUCT = FIX_PRICE_PRODUCT;

    }


    public int getPrice() {
        return FIX_PRICE_PRODUCT;
    }

    @Override
    public String toString() {
        return String.format("%s: Фиксированная цена %s", getNameProduct(), getPrice());
    }

    @Override
    public boolean isSpecial() {
        return true;
    }
}
