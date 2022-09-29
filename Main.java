import Classes.BBQ;
import Classes.Capricioasa;
import Classes.PizzaPlace;

public class Main {
    public static void main(String[] args) {
        PizzaPlace pizzaPlace = new PizzaPlace("Bob" ,new BBQ( 560, 200, 150, 100, 105));
        System.out.println(pizzaPlace.getname() + " ordered BBQ pizza that has " + pizzaPlace.getBbq().getGramsOfChicken() + " grams of chicken, " + pizzaPlace.getBbq().getGramsOfBacon()
        + " grams of bacon and " + pizzaPlace.getBbq().getGramsOfBBQ() + " grams of BBQ souse. This pizza is " + pizzaPlace.getBbq().getGrams()
                + " grams and it costs " + pizzaPlace.getBbq().getPrice() + " lei.");

        PizzaPlace pizzaPlace1 = new PizzaPlace("Max", new Capricioasa(600, 50, 30, 30, 50, 70, 110));
        System.out.println(pizzaPlace1.getname() + " " + pizzaPlace1.getCapricioasa().getGrams() + " " + pizzaPlace1.getCapricioasa().getGramsOfMushrooms()
                + " " + pizzaPlace1.getCapricioasa().getGramsOfEggplants() + " " + pizzaPlace1.getCapricioasa().getGramsOfSheepCheese() + " " + pizzaPlace1.getCapricioasa().getGramsOfMozzarella()
                + " " + pizzaPlace1.getCapricioasa().getGramsOfHam() + " " + pizzaPlace1.getCapricioasa().getPrice());
    }
}