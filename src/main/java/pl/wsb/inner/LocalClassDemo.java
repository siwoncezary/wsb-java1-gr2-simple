package pl.wsb.inner;
//Przykład interfejsu funkcyjnego
interface Function{
    double calc(double a, double b);
}

interface Handle{
    double inc(double a);
    String error();
}

class Addition implements Function{

    @Override
    public double calc(double a, double b) {
        return a + b;
    }
}
public class LocalClassDemo {
    public static void main(String[] args) {
        //Przykład klasy lokalnej
        class Test{
            private String name;
        }
        Test test = new Test();
        test.name = "Hello";
        System.out.println(test);
        print();
    }

    public static void print(){
        Function add = new Addition();
        Function[] funtions = new Function[5];
        funtions[0] = add;
        //Klasa anonimowa pozwala pominąć definicję klasy implementującej Function
        //do razu można zaimplementować metodę interfejsu
        funtions[1] = new Function() {
            @Override
            public double calc(double a, double b) {
                return a * b;
            }
        };
        //Przykład lambdy realizującej tę samą funkcję jak wyżej
        funtions[2] = (a, b) -> a * b;
        funtions[3] = (c, d) -> c / d;
        funtions[4] = (a, b) -> a - b;
        for(Function function: funtions) {
            System.out.println(function.calc(12, 45));
        }

        //Klasy anonimowe tworzymy głównie do obiektów implementujących interfejsy o większej niż
        //jeden metodach abstrakcyjnych
        Handle hadler = new Handle() {
            //klasa anonimowa może mieć pola i metody prywatne
            //możliwe odwołanie do this, nadpisywanie toString, hashCode, equals
            //Powyższe nie są dostępne w lambdach!!!
            private double result;
            @Override
            public double inc(double a) {
                result = a + 10;
                return a + 10;
            }

            @Override
            public String error() {
                return this.result < 0 ? "Error" : "NoError";
            }
        };
    }
}
