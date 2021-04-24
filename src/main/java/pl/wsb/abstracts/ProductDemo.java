package pl.wsb.abstracts;

import java.util.ArrayList;
import java.util.List;

public class ProductDemo {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Laptop(2, "MSI", 16, "I5", 200_000));
        products.add(new Paint(1.5, "decoral blue", 500, 2_000));
        for(Product p: products){
            System.out.println(p.price());
        }
    }
}
