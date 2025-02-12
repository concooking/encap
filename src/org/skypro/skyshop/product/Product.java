package org.skypro.skyshop.product;

public abstract class Product {
    final String product;

    public Product(String product) {
        this.product = product;
    }

    public Product(int i, int i1) {
        product = null;
    }

    public Product() {

        product = "";
    }

    public String getProduct() {
        return product;
    }

    public abstract int getBasePricePrice();

    public abstract int getPrice();


    public void printPrice() {
    }
}


