package pl.wsb;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz pierwszy bok:");
        try {
            int sideA = scanner.nextInt();
            System.out.println("Wpisz drugi bok");
            int sideB = scanner.nextInt();
            System.out.println("Pole prostokąta");
            System.out.println(sideA * sideB);
        } catch (InputMismatchException exception){
            System.out.println(exception);
            System.out.println("Niepoprawna długość boku, następnym razem wpisz liczbę całkowitą!!!");
            System.out.println("Niemożliwe obliczenie pola prostokąta!");
        }
    }
}
