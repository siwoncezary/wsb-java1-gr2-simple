package pl.wsb.enums;

import java.util.Scanner;

enum Color implements RGB{
    RED(0xFF, 0, 0), WHITE(255, 255, 255), BLACK(0,0,0);
    int r, g, b;

    Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    @Override
    public int fromRGB(int r, int g, int b) {
        return this.r*0xFFFF+this.g*0xFF+this.b;
    }
}

@FunctionalInterface
interface RGB{
    int fromRGB(int r, int g, int b);
}

public class EnumsDemo {
    public static void main(String[] args) {
        Direction direction = Direction.DOWN;
        Scanner scanner = new Scanner(System.in);
        String dirStr = scanner.next();
//        switch (dirStr){
//            case "W": direction = Direction.UP;
//                break;
//            case "S": direction = Direction.DOWN;
//                break;
//            case "A" : direction = Direction.LEFT;
//                break;
//            case "D" : direction = Direction.RIGHT;
//        }
        direction = Direction.of(dirStr);
        System.out.println(direction);
        System.out.println(direction.name());
        System.out.println(direction.ordinal());
        System.out.println(direction == Direction.DOWN);
        Color color = Color.BLACK;
        //System.out.println(color == direction);
    }
}
