package Zadanie1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=  new Scanner(System.in);

        System.out.println("Program służy do obliczenia pola figur: ");
        System.out.println("1 – prostokąta");
        System.out.println("2 – kwadratu");
        System.out.println("3 – trójkąta");
        System.out.println("4 – rombu");
        System.out.println("5 – równoległoboku");
        System.out.println("6 – trapezu");
        System.out.print("Powiedz proszę, jaka figura Ciebie interesuje: ");

        int opcja = scanner.nextInt();

        double pole;
        switch (opcja) {
            case 1 -> pole = getPoleProstokata();
            case 2 -> pole = getPoleKwadratu();
            case 3 -> pole = getPoleTrojkata();
            case 4 -> pole = getPoleRombu();
            case 5 -> pole = getPoleRownolegloboku();
            case 6 -> pole = getPoleTrapezu();
            default -> {
                System.out.println("Nieznany typ operacji");
                return;
            }
        }

        System.out.println("Pole jest równe: " + pole);
    }

    public static double getPoleProstokata(){
        System.out.println("Wybrałeś prostokąt.");
        System.out.print("Podaj długość pierwszego boku: ");
        double a = getDoubleFromUser();

        System.out.print("Podaj długość drugiego boku: ");
        double b = getDoubleFromUser();

        return a*b;
    }
    public static double getPoleKwadratu(){
        System.out.println("Wybrałeś kwadratu.");
        System.out.print("Podaj długość boku: ");
        double a = getDoubleFromUser();

        return a*a;
    }
    public static double getPoleTrojkata(){
        System.out.println("Wybrałeś trójkąt.");
        System.out.print("Podaj długość podstawy: ");
        double a = getDoubleFromUser();

        System.out.print("Podaj długość wysokości: ");
        double b = getDoubleFromUser();

        return (a*b)/0.5;
    }
    public static double getPoleRombu(){
        System.out.println("Wybrałeś romb.");
        System.out.print("Podaj długość pierwszej przekątnej: ");
        double a = getDoubleFromUser();
        System.out.print("Podaj długość drugiej przekątnej: ");
        double b = getDoubleFromUser();

        return (a*b)/2;
    }
    public static double getPoleRownolegloboku(){
        System.out.println("Wybrałeś równoległobok.");
        System.out.print("Podaj długość podstawy: ");
        double a = getDoubleFromUser();

        System.out.print("Podaj długość wysokości: ");
        double b = getDoubleFromUser();

        return a*b;
    }
    public static double getPoleTrapezu(){
        System.out.println("Wybrałeś trapez.");
        System.out.print("Podaj długość podstawy dolnej: ");
        double a = getDoubleFromUser();
        System.out.print("Podaj długość podstawy górnej: ");
        double b = getDoubleFromUser();
        System.out.print("Podaj długość wysokości: ");
        double c = getDoubleFromUser();

        return 0.5*(a+b)*c;
    }


    public static double getDoubleFromUser(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}