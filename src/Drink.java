public class Drink {
    private String name;
    private double price;
    private boolean alcohol;

    public Drink(String name, double price, boolean alcohol) {
        this.name = name;
        this.price = price;
        this.alcohol = alcohol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAlcohol() {
        return alcohol;
    }

    public void setAlcohol(boolean alcohol) {
        this.alcohol = alcohol;
    }
}
