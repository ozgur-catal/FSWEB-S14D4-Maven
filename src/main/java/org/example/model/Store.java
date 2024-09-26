package org.example.model;

public class Store {
    public static void main(String[] args) {

        Chocolate a = new Chocolate("Dido", 12.50, "chocolate", "Milk");
        Coke b = new Coke("drinks", 21.0, "coke", 5);
        Bread c = new Bread("bakery", 5.0,"bread", "Wholemeal");

        ProductForSale[] objects = {a,b,c};

        listProducts(objects);
    }

    public static void listProducts(ProductForSale[] products) {

        for (ProductForSale product: products){
            product.showDetails();
        }

    }
}