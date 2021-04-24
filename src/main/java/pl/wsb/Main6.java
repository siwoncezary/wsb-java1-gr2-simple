package pl.wsb;

import pl.wsb.rectangle.Rectangle;

import java.util.HashSet;
import java.util.Set;

public class Main6 {
    public static void main(String[] args) {
        Set<Rectangle> set = new HashSet<>();
        set.add(Rectangle.of(3, 5));
        set.add(Rectangle.of(4, 1));
        set.add(Rectangle.of(4, 5));
        set.add(Rectangle.of(3, 5));
        System.out.println(set.size());
        System.out.println(set.contains(Rectangle.of(4, 1)));
    }
}
