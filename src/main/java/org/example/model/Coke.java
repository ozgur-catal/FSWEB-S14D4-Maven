package org.example.model;

public class Coke extends ProductForSale {

    private int calorie;

    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    public Coke(String type, double price, String description, int calorie) {
        super(type, price, description);
        this.calorie = calorie;
    }

    public double getCalorie() {
        return calorie;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() + ", Price: " + getPrice()
                + ", Description: " + getDescription() + ", Calorie: " + getCalorie());
    }
}
