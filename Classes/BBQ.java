package Classes;

public class BBQ {

    private int grams;
    private int gramsOfChicken;
    private int gramsOfBacon;
    private int gramsOfBBQ;
    private double price;

    public BBQ(int grams, int gramsOfChicken, int gramsOfBacon, int gramsOfBBQ, double price) {
        this.grams = grams;
        this.gramsOfChicken = gramsOfChicken;
        this.gramsOfBacon = gramsOfBacon;
        this.gramsOfBBQ = gramsOfBBQ;
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

    public int getGramsOfBacon() {
        return gramsOfBacon;
    }

    public void setGramsOfBacon(int gramsOfBacon) {
        this.gramsOfBacon = gramsOfBacon;
    }

    public int getGramsOfBBQ() {
        return gramsOfBBQ;
    }

    public void setGramsOfBBQ(int gramsOfBBQ) {
        this.gramsOfBBQ = gramsOfBBQ;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
