package Classes;

public class Pepperoni {

    private int grams;
    private int gramsOfSalami;
    private int gramsOfMozzarella;
    private boolean paprikaAndChilly;
    private double price;

    public Pepperoni(int grams, int gramsOfSalami, int gramsOfMozzarella, boolean paprikaAndChilly, double price) {
        this.grams = grams;
        this.gramsOfSalami = gramsOfSalami;
        this.gramsOfMozzarella = gramsOfMozzarella;
        this.paprikaAndChilly = paprikaAndChilly;
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

    public int getGramsOfMozzarella() {
        return gramsOfMozzarella;
    }

    public void setGramsOfMozzarella(int gramsOfMozzarella) {
        this.gramsOfMozzarella = gramsOfMozzarella;
    }

    public boolean isPaprikaAndChilly() {
        return paprikaAndChilly;
    }

    public void setPaprikaAndChilly(boolean paprikaAndChilly) {
        this.paprikaAndChilly = paprikaAndChilly;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
