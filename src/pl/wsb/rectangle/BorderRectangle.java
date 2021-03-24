package pl.wsb.rectangle;

public class BorderRectangle extends Rectangle{
    private double borderUnitPrice;

    public BorderRectangle(){
        super(0.5, 0.5);
    }

    public BorderRectangle(double sideA, double sideB) {
        super(sideA, sideB);
    }

    public BorderRectangle(double sideA, double sideB, double borderUnitPrice) {
        super(sideA, sideB);
        this.borderUnitPrice = borderUnitPrice;
    }

    public double perimeter(){
        return sideA * 2 + sideB * 2;
    }

    @Override
    public double price() {
        return super.price() + perimeter() * borderUnitPrice;
    }

    @Override
    public String toString(){
        String result = "Bok 1: ";
        result += sideA;
        result += " bok 2: ";
        result += sideB;
        result += " cena jednostkowa brzegu: ";
        result += borderUnitPrice;
        return result;
    }
}
