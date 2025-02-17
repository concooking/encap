package org.skypro.skyshop;

import org.skypro.skyshop.product.Product;

public class DiscountedProduct extends Product {
    private final int basePrice;
    private final int discountPercent;

    public DiscountedProduct(String productName, int basePrice, int discountPercent) {
        super(productName);
        this.basePrice = basePrice;
        this.discountPercent = discountPercent;
    }

    public double getDiscountPrice() {
        return basePrice - ((double) basePrice / 100 * discountPercent);

    }

    @Override
    public int getPrice() {
        return basePrice;
    }

    public String toString() {
        return String.format("%s: %.1f скидка %s%%", getNameProduct(), getDiscountPrice(), discountPercent);
    }

    @Override
    public boolean isSpecial() {
        return true;
    }
}

