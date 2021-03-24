package pl.wsb.abstracts;

final public class Laptop extends Product{
    private final int RAM;
    private final String CPU;
    private final int price;

    public Laptop(double weight, String name, int RAM, String CPU, int price) {
        super(weight, name);
        this.RAM = RAM;
        this.CPU = CPU;
        this.price = price;
    }

    protected Laptop(double weight, String name) {
        super(weight, name);
        RAM = 0;
        CPU = "";
        price = 0;
    }

    @Override
    public int price() {
        return price;
    }
}
