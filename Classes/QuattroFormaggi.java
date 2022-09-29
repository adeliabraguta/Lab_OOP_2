package Classes;

public class QuattroFormaggi {

    private int grams;
    private int gramsOfBrieCheese;
    private int gramsOParmesanCheese;
    private int gramsOfMozzarellaCheese;
    private int gramsOfDorbluCheese;
    private double price;

    public QuattroFormaggi(int grams, int gramsOfBrieCheese, int gramsOParmesanCheese, int gramsOfMozzarellaCheese, int gramsOfDorbluCheese, double price) {
        this.grams = grams;
        this.gramsOfBrieCheese = gramsOfBrieCheese;
        this.gramsOParmesanCheese = gramsOParmesanCheese;
        this.gramsOfMozzarellaCheese = gramsOfMozzarellaCheese;
        this.gramsOfDorbluCheese = gramsOfDorbluCheese;
        this.price = price;
    }

    public int getGrams() {
        return grams;
    }

    public void setGrams(int grams) {
        this.grams = grams;
    }

    public int getGramsOfBrieCheese() {
        return gramsOfBrieCheese;
    }

    public void setGramsOfBrieCheese(int gramsOfBrieCheese) {
        this.gramsOfBrieCheese = gramsOfBrieCheese;
    }

    public int getGramsOParmesanCheese() {
        return gramsOParmesanCheese;
    }

    public void setGramsOParmesanCheese(int gramsOParmesanCheese) {
        this.gramsOParmesanCheese = gramsOParmesanCheese;
    }

    public int getGramsOfMozzarellaCheese() {
        return gramsOfMozzarellaCheese;
    }

    public void setGramsOfMozzarellaCheese(int gramsOfMozzarellaCheese) {
        this.gramsOfMozzarellaCheese = gramsOfMozzarellaCheese;
    }

    public int getGramsOfDorbluCheese() {
        return gramsOfDorbluCheese;
    }

    public void setGramsOfDorbluCheese(int gramsOfDorbluCheese) {
        this.gramsOfDorbluCheese = gramsOfDorbluCheese;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
