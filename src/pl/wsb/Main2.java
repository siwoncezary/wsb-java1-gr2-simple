package pl.wsb;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz pierwszy bok:");
//        if (scanner.hasNextInt()) {
//            int sideA = scanner.nextInt();
//            System.out.println("Pole prostokąta: " + sideA * sideB);
//            if (scanner.hasNextInt()){
//                System.out.println("Wpisz drugi bok");
//                int sideB = scanner.nextInt();
//            } else {
//                System.out.println("Niemożliwe obliczenie pola, bo wpisany bok nie jest liczbą");
//            }
//        } else {
//            System.out.println("Niemożliwe obliczenie pola, bo wpisany bok nie jest liczbą!!");
//        }
        if (!scanner.hasNextInt()){
            System.out.println("Wpisany bok nie jest liczbą, niemożliwe obliczenie pola!");
            //System.exit(0);
            return;
        }
        int sideA = scanner.nextInt();
        System.out.println("Wpisz drugi bok:");
        if (!scanner.hasNextInt()){
            System.out.println("Wpisany bok nie jest liczbą, niemożliwe obliczenie pola!");
            return;
        }
        int sideB = scanner.nextInt();
        System.out.println("Pole prostokąta: " + sideB * sideA);
    }
}
