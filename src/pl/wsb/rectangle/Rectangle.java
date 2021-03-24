package pl.wsb.rectangle;

import java.util.Objects;

public class Rectangle{
    public static final double DEFAULT_UNIT_PRICE = 5;
    protected final double sideA;
    protected final double sideB;
    private double unitPrice;
    static {
        System.out.println("BLOK STATYCZNY");
    }
    protected Rectangle(double sideA, double sideB){
        this.sideB = sideB;
        this.sideA = sideA;
        this.unitPrice = DEFAULT_UNIT_PRICE;
    }

    public static Rectangle of(double sideA, double sideB){
        if (sideA > 0 && sideB > 0){
            return new Rectangle(sideA, sideB);
        } else {
            throw  new IllegalArgumentException("Nie można utworzyć obiektu z ujemnym bokiem!");
        }
    }
    //Niezaleca się tworzenia metod zwracających wartość null
    public static  Rectangle ofNull(double sideA, double sideB){
        if (sideA > 0 && sideB > 0){
            return new Rectangle(sideA, sideB);
        } else {
            return null;
        }
    }

    public double area(){
        return sideA * sideB;
    }

    public double price(){
        return area() * unitPrice;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", unitPrice=" + unitPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("RECT EQUALS");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.sideA, sideA) == 0 && Double.compare(rectangle.sideB, sideB) == 0;
    }

    @Override
    public int hashCode() {
        System.out.println("RECT HASHCODE");
        return Objects.hash(sideA, sideB);
    }
}
