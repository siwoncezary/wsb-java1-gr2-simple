package pl.wsb.rectangle;

import java.util.Objects;

public class Main5 {
    public static void main(String[] args) {
       Rectangle rectangle1 = new Rectangle(3, 5);
       Rectangle rectangle2 = new Rectangle(3, 5);
       Rectangle rectangle3 = new Rectangle( 5, 6);
       if (rectangle1 == rectangle2){
           System.out.println("To jest ten sam obiekt");
       } else {
           System.out.println("To są różne obiekty");
       }
       if (rectangle1.equals(rectangle2)){
           System.out.println("Prostokąty mają identyczne boki");
       }
       rectangle1 = null;
       rectangle3 = null;
       if (Objects.equals(rectangle1, rectangle3)){
           System.out.println("Prostokąty mają identyczne boki");
       } else {
           System.out.println("Prostokąty mają różne boki");
       }
    }
}
