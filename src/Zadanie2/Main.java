package Zadanie2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int a = scanner.nextInt();

        if(a%2==0) {
            System.out.println("Liczba "+ a + " jest podzielna przez 2.");
        }

        if (a%3==0) {
            System.out.println("Liczba " + a + " jest podzielna przez 3.");
        }

        if (a%5==0) {
            System.out.println("Liczba " + a + " jest podzielna przez 5.");
        }

        if (a%2 != 0 && a%3 != 0 && a%5 != 0) {
            System.out.println("Liczba " + a + " nie jest podzielna przez 2,3 lub 5.");
        }
    }
}
