package Zadanie7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę a: ");
        int a = scanner.nextInt();
        System.out.print("Podaj liczbę b: ");
        int b = scanner.nextInt();
        System.out.print("Podaj liczbę n: ");
        int n = scanner.nextInt();
        modulo(a,b,n);
    }

    public static void modulo (int a, int b, int n ) {
        if( a % n == b%n) {
            System.out.print("Liczby " + a + " i " + b + " przystają do siebie modulo " + n + ".");
        } else if( a % n != b%n) {
            System.out.print("Liczby " + a + " i " + b + " nie przystają do siebie modulo " + n + ".");
        }
    }
}
