package Classes;

public class Margherita {

    private int grams;
    private int gramsOfTomatoSouse;
    private int gramsOfMozzarella;
    private double price;

    public Margherita(int grams, int gramsOfTomatoSouse, int gramsOfMozzarella, double price) {
        this.grams = grams;
        this.gramsOfTomatoSouse = gramsOfTomatoSouse;
        this.gramsOfMozzarella = gramsOfMozzarella;
        this.price = price;
    }

    public int getGrams() {
        return grams;
    }

    public void setGrams(int grams) {
        this.grams = grams;
    }

    public int getGramsOfTomatoSouse() {
        return gramsOfTomatoSouse;
    }

    public void setGramsOfTomatoSouse(int gramsOfTomatoSouse) {
        this.gramsOfTomatoSouse = gramsOfTomatoSouse;
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
