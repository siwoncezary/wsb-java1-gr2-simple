package pl.wsb.abstracts;

abstract public class Product {
    private final double weight;
    private final String name;

    protected Product(double weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public abstract int price();

    @Override
    public String toString() {
        return "Product{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
