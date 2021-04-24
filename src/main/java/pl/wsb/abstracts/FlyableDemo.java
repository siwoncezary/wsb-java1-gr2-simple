package pl.wsb.abstracts;

import java.util.ArrayList;
import java.util.List;

public class FlyableDemo {
    public static void main(String[] args) {
        List<Flyable> list = new ArrayList<>();
        list.add(new Drone(1000,"XSQ", 20_000));
        list.add(new Duck());
        for(Flyable object: list){
            object.takeOff();
            object.land();
            if(object instanceof Product){
                Product product = (Product) object;
                System.out.println("Produkt " + product.getName());
            }
        }
    }
}
