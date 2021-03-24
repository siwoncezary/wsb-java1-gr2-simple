package pl.wsb.abstracts;

public class Duck implements Flyable{
    @Override
    public void takeOff() {
        System.out.println("Duck is taking off");
    }

    @Override
    public void land() {
        System.out.println("Duck is landing");
    }
}
