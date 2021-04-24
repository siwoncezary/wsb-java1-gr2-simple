package pl.wsb;


import pl.wsb.rectangle.BorderRectangle;
import pl.wsb.rectangle.Rectangle;

public class Main4 {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[5];
        Rectangle rectangle = new BorderRectangle(10, 10, 10);

        rectangles[0] = rectangle;
        rectangles[1] = Rectangle.of(23.67, 456.6);
        rectangles[2] = Rectangle.of(34, 56);
        rectangles[3] = Rectangle.ofNull(-45.7, -99.4);
        double areaSum = 0;
        for (int i = 0; i < rectangles.length; i++){
            if (rectangles[i] != null) {
                areaSum += rectangles[i].area();
                System.out.println(rectangles[i].area());
            }
        }
        double priceSum = 0;
        for(Rectangle rect: rectangles){
            if (rect != null) {
                areaSum += rect.area();
                priceSum += rect.price();
                System.out.println(rect);
            }
        }
        System.out.println("suma pól: " + areaSum);
        System.out.println("wartość całkowita: " + priceSum);
    }
}
