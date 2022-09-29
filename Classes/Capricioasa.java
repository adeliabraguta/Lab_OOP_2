package Classes;

public class Capricioasa {

    private int grams;
    private int gramsOfMushrooms;
    private int gramsOfEggplants;
    private int gramsOfSheepCheese;
    private int gramsOfMozzarella;
    private int gramsOfHam;
    private double price;

    public Capricioasa(int grams, int gramsOfMushrooms, int gramsOfEggplants, int gramsOfSheepCheese, int gramsOfMozzarella, int gramsOfHam, double price) {
        this.grams = grams;
        this.gramsOfMushrooms = gramsOfMushrooms;
        this.gramsOfEggplants = gramsOfEggplants;
        this.gramsOfSheepCheese = gramsOfSheepCheese;
        this.gramsOfMozzarella = gramsOfMozzarella;
        this.gramsOfHam = gramsOfHam;
        this.price = price;
    }

    public int getGrams() {
        return grams;
    }

    public void setGrams(int grams) {
        this.grams = grams;
    }

    public int getGramsOfMushrooms() {
        return gramsOfMushrooms;
    }

    public void setGramsOfMushrooms(int gramsOfMushrooms) {
        this.gramsOfMushrooms = gramsOfMushrooms;
    }

    public int getGramsOfEggplants() {
        return gramsOfEggplants;
    }

    public void setGramsOfEggplants(int gramsOfEggplants) {
        this.gramsOfEggplants = gramsOfEggplants;
    }

    public int getGramsOfSheepCheese() {
        return gramsOfSheepCheese;
    }

    public void setGramsOfSheepCheese(int gramsOfSheepCheese) {
        this.gramsOfSheepCheese = gramsOfSheepCheese;
    }

    public int getGramsOfMozzarella() {
        return gramsOfMozzarella;
    }

    public void setGramsOfMozzarella(int gramsOfMozzarella) {
        this.gramsOfMozzarella = gramsOfMozzarella;
    }

    public int getGramsOfHam() {
        return gramsOfHam;
    }

    public void setGramsOfHam(int gramsOfHam) {
        this.gramsOfHam = gramsOfHam;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
