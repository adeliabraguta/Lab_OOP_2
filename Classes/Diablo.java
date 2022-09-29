package Classes;

public class Diablo {

    private int grams;
    private int gramsOfSalami;
    private int gramsOfSausages;
    private int gramsOfMushrooms;
    private int gramsOfOlives;
    private int gramsOfHotPeppers;
    private int gramsOfMozzarella;
    private double price;

    public Diablo(int grams, int gramsOfSalami, int gramsOfSausages, int gramsOfMushrooms, int gramsOfOlives, int gramsOfHotPeppers, int gramsOfMozzarella, double price) {
        this.grams = grams;
        this.gramsOfSalami = gramsOfSalami;
        this.gramsOfSausages = gramsOfSausages;
        this.gramsOfMushrooms = gramsOfMushrooms;
        this.gramsOfOlives = gramsOfOlives;
        this.gramsOfHotPeppers = gramsOfHotPeppers;
        this.gramsOfMozzarella = gramsOfMozzarella;
        this.price = price;
    }

    public int getGrams() {
        return grams;
    }

    public void setGrams(int grams) {
        this.grams = grams;
    }

    public int getGramsOfSalami() {
        return gramsOfSalami;
    }

    public void setGramsOfSalami(int gramsOfSalami) {
        this.gramsOfSalami = gramsOfSalami;
    }

    public int getGramsOfSausages() {
        return gramsOfSausages;
    }

    public void setGramsOfSausages(int gramsOfSausages) {
        this.gramsOfSausages = gramsOfSausages;
    }

    public int getGramsOfMushrooms() {
        return gramsOfMushrooms;
    }

    public void setGramsOfMushrooms(int gramsOfMushrooms) {
        this.gramsOfMushrooms = gramsOfMushrooms;
    }

    public int getGramsOfOlives() {
        return gramsOfOlives;
    }

    public void setGramsOfOlives(int gramsOfOlives) {
        this.gramsOfOlives = gramsOfOlives;
    }

    public int getGramsOfHotPeppers() {
        return gramsOfHotPeppers;
    }

    public void setGramsOfHotPeppers(int gramsOfHotPeppers) {
        this.gramsOfHotPeppers = gramsOfHotPeppers;
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
