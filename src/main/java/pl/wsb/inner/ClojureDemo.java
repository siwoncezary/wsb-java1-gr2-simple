package pl.wsb.inner;

public class ClojureDemo {
    public static void main(String[] args) {
        //Domknięcie dotyczy zmiennych typu final lub efektywnie finalnych
        //Dotyczy tylko widocznych w bloku lambdy zmiennych, ale nie parametrów
        //zmienna w lokalnym otoczeniu lambdy
        double[] x = {1};
        //lambda odwołuje się do zmiennej lokalnej w domknięciu
        Function linear = (a, b) -> a * x[0] + b;
        x[0] = 7;
        //UWAGA!!! zostanie uwzględniony nowy x[0] czyli 7!!!
        System.out.println(linear.calc(12, 4));
    }
}
