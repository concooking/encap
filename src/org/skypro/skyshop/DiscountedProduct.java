package org.skypro.skyshop;

import org.skypro.skyshop.product.Product;

class DiscountedProduct extends Product {
    private int basePrice;
    private int discountPercent;

    public DiscountedProduct(String productName, int basePrice, int discountPercent) {
        super(productName);
        this.basePrice = basePrice;
        this.discountPercent = discountPercent;
    }

    public int getBasePricePrice() {
        return 0;

    }

    @Override
    public int getPrice() {
        return (int) Math.ceil((double) basePrice * (100 - discountPercent) / 100 / 100);



    }

    public int getDiscountPercent() {
        return discountPercent;
    }


    public int getDiscountPrice() {
        return (int) Math.ceil((double) basePrice * (100 - discountPercent) / 100 / 100);

    }
    public void printDiscountPrice () {
        int discountedPrice = getDiscountPrice();
        System.out.printf("%d руб. %02d коп.%n", discountedPrice / 100, discountedPrice % 100);
    }
}
