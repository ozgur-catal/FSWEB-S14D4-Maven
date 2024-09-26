package org.example.model;

public class Chocolate extends ProductForSale {
    private String aroma;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, double price, String description, String aroma) {
        super(type, price, description);
        this.aroma = aroma;
    }

    public String getAroma() {
        return aroma;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType());
        System.out.println("Price: " +  getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Aroma: " + getAroma());
    }
}
