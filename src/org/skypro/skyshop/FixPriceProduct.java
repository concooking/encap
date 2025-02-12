package org.skypro.skyshop;

public class FixPriceProduct {
    private String productName;
    private int fixedPrice;
    public static final double FIX_PRICE = 100;
    public FixPriceProduct(String productName) {
        this.productName = productName;
        this.fixedPrice = 100;

    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return fixedPrice;
    }

    public void printPrice() {
        System.out.printf("Цена продукта '%s':%d руб.%n", productName, fixedPrice);
    }
}
