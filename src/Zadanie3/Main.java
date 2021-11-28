package Zadanie3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        int a = scanner.nextInt();

        if (a / 10 == 0) {
            System.out.println("Liczba " + a + " jest jednocyfrowa");
        } else if (a / 100 == 0) {
            System.out.println("Liczba " + a + " jest dwucyfrowa");
        } else if (a / 1000 == 0) {
            System.out.println("Liczba " + a + " jest trzycyfrowa");
        } else if (a / 10000 == 0) {
            System.out.println("Liczba " + a + " jest czterocyfrowa");
        } else {
            System.out.println("Błąd");
        }
    }
}
