package org.example.model;

public class Bread extends ProductForSale {
    private String texture;

    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    public Bread(String type, double price, String description, String texture) {
        super(type, price, description);
        this.texture = texture;
    }

    public String getTexture() {
        return texture;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Texture: " + getTexture());

    }
}
