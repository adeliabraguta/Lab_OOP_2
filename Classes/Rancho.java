package Classes;

public class Rancho {

    private int grams;
    private int gramsOfChicken;
    private int gramsOfMushrooms;
    private int gramsOfMozzarella;
    private double price;

    public Rancho(int grams, int gramsOfChicken, int gramsOfMushrooms, int gramsOfMozzarella, double price) {
        this.grams = grams;
        this.gramsOfChicken = gramsOfChicken;
        this.gramsOfMushrooms = gramsOfMushrooms;
        this.gramsOfMozzarella = gramsOfMozzarella;
        this.price = price;
    }

    public int getGrams() {
        return grams;
    }

    public void setGrams(int grams) {
        this.grams = grams;
    }

    public int getGramsOfChicken() {
        return gramsOfChicken;
    }

    public void setGramsOfChicken(int gramsOfChicken) {
        this.gramsOfChicken = gramsOfChicken;
    }

    public int getGramsOfMushrooms() {
        return gramsOfMushrooms;
    }

    public void setGramsOfMushrooms(int gramsOfMushrooms) {
        this.gramsOfMushrooms = gramsOfMushrooms;
    }

    public int getGramsOfMozzarella() {
        return gramsOfMozzarella;
    }

    public void setGramsOfMozzarella(int gramsOfMozzarella) {
        this.gramsOfMozzarella = gramsOfMozzarella;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
