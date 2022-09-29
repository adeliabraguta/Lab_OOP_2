package Classes;

public class Neapolitana {

    private int grams;
    private int gramsOfHam;
    private int gramsOfMushrooms;
    private int gramsOfMozzarella;
    private double price;

    public Neapolitana(int grams, int gramsOfHam, int gramsOfMushrooms, int gramsOfMozzarella, double price) {
        this.grams = grams;
        this.gramsOfHam = gramsOfHam;
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

    public int getGramsOfHam() {
        return gramsOfHam;
    }

    public void setGramsOfHam(int gramsOfHam) {
        this.gramsOfHam = gramsOfHam;
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
