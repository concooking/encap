package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {

    private Product[] productBasket;

    public ProductBasket(Product[] productBasket) {
        this.productBasket = productBasket;
    }

    public void addProductBasket(Product newProduct) {
        int i = 0;
        for (Product product : productBasket) {
            if (product == null) {
                productBasket[i] = newProduct;
                break;

            } else {
                i++;
            }
        }
    }

    public int totalCostBasket() {
        int result = 0;
        for (Product product : productBasket) {
            if (product == null) {
                break;

            } else {
                result += product.getPrice();

            }
        }
        return result;

    }

    public void printContentBasket() {
        if (productBasket[0] != null) {
            for (Product product : productBasket) {
                if (product != null) {
                    System.out.println(String.format("<%s>: <%s>", product.getProduct(), product.getPrice()));
                }
            }
            System.out.println(String.format("Итого <%s>", totalCostBasket()));
        }
    }

    public boolean searchProductByName(String nameProduct) {
        boolean buff = false;
        for (Product product : productBasket) {
            if (product != null && nameProduct.equals(product.getProduct())) {
                buff = true;
            }

        }
        return buff;
    }
    public void clearBasket() {
        int i = 0;
        for (Product product : productBasket) {
            productBasket[i] = null;
            i++;
        }
    }
}
