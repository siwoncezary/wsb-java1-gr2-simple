package pl.wsb.inner;

public class InnerClassDemo {
    public static void main(String[] args) {
        Panel panel = new Panel(12, 14);
        Panel.Border border = panel.new Border();
        System.out.println(border.getLength());
        System.out.println(panel.getBorderLength());
    }
}
