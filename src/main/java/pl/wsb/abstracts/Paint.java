package pl.wsb.abstracts;

public class Paint extends Product{
    private final int capacity;
    private final int unitPrice;

    protected Paint(double weight, String name, int capacity, int unitPrice) {
        super(weight * capacity, name);
        this.capacity = capacity;
        this.unitPrice = unitPrice;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    @Override
    public int price() {
        return capacity * unitPrice/1000;
    }
}
