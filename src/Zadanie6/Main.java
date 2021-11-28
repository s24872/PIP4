package Zadanie6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        double liczba = scanner.nextDouble();
        int signum = znakLiczby(liczba);

        System.out.print("Wartość funkcji signum dla " + liczba + " to " +signum);
    }

    public static int znakLiczby(double liczba) {
        if (liczba < 0) {
            return -1;
        }
        else if (liczba == 0) {
            return 0;
        }
        else if (liczba > 0) {
            return 1;
        } else {
            return '-';
        }
    }
}
