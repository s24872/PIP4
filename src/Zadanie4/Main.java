package Zadanie4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj numer miesiąca: ");
        int numerMiesiaca = scanner.nextInt();

        switch (numerMiesiaca) {
            case 1:
                System.out.print("Wspomiałeś styczeń.");
                break;
            case 2:
                System.out.print("Wspomiałeś luty.");
                break;
            case 3:
                System.out.print("Wspomiałeś marzec.");
                break;
            case 4:
                System.out.print("Wspomiałeś kwiecień.");
                break;
            case 5:
                System.out.print("Wspomiałeś maj.");
                break;
            case 6:
                System.out.print("Wspomiałeś czerwiec");
                break;
            case 7:
                System.out.print("Wspomiałeś lipiec");
                break;
            case 8:
                System.out.print("Wspomiałeś sierpień");
                break;
            case 9:
                System.out.print("Wspomiałeś wrzesień ");
                break;
            case 10:
                System.out.print("Wspomiałeś październik");
                break;
            case 11:
                System.out.print("Wspomiałeś listopad");
                break;
            case 12:
                System.out.print("Wspomiałeś grudzień");
                break;
            default:
                System.out.print("Nie ma takiego miesiąca.");

        }
    }
}
