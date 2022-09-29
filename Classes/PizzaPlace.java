package Classes;

public class PizzaPlace {

    private String name;
    private BBQ bbq;
    private Capricioasa capricioasa;
    private Diablo diablo;
    private Margherita margherita;
    private Neapolitana neapolitana;
    private Pepperoni pepperoni;
    private QuattroFormaggi quattroFormaggi;
    private Rancho rancho;

    public PizzaPlace(String name, BBQ bbq) {
        this.name = name;
        this.bbq = bbq;
    }

    public PizzaPlace(String name, Capricioasa capricioasa) {
        this.name = name;
        this.capricioasa = capricioasa;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public BBQ getBbq() {
        return bbq;
    }

    public void setBbq(BBQ bbq) {
        this.bbq = bbq;
    }

    public Capricioasa getCapricioasa() {
        return capricioasa;
    }

    public void setCapricioasa(Capricioasa capricioasa) {
        this.capricioasa = capricioasa;
    }
}
