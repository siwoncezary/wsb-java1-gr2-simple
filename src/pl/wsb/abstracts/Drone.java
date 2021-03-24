package pl.wsb.abstracts;

public class Drone extends Product implements Flyable {
    private final int price;

    protected Drone(double weight, String name, int price) {
        super(weight, name);
        this.price = price;
    }

    @Override
    public void takeOff() {
        System.out.println("Take off");
    }

    @Override
    public void land() {
        System.out.println("Land");
    }

    @Override
    public int price() {
        return price;
    }
}
