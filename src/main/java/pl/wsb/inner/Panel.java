package pl.wsb.inner;

public class Panel {
    private double width;
    private double height;
    private Border border;
    public Panel(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public class Border{
        double length;

        public Border(double length) {
            this.length = length;
        }

        public Border(){
            length = width * 2 + height * 2;
            border = this;
        }

        public double getLength() {
            return length;
        }
    }

    public void setBorder(Border border) {
        this.border = border;
    }

    public double getBorderLength(){
        return  border.length;
    }
}
