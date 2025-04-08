public class Product {
    private int id;
    private String name;
    private double priceUsd;

    public Product(int id, String name, double priceUsd) {
        this.id = id;
        this.name = name;
        this.priceUsd = priceUsd;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPriceUsd() {
        return priceUsd;
    }
}