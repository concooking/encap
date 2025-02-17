package org.skypro.skyshop.product;

public abstract class Product {
    final String product;

    public Product(String product) {
        this.product = product;
    }

    public String getNameProduct(){
        return product;
    }

    public abstract int getPrice();

    public abstract boolean isSpecial();
}

