package Zadanie5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj numer miesiąca: ");
        int miesiac = scanner.nextInt();

        if (miesiac == 12) {
            System.out.print("Hura, to już koniec roku.");
        } else {
            String napis = " ";
            switch (miesiac) {
                case 1:
                    napis += "styczeń, ";
                case 2:
                    napis += "luty, ";
                case 3:
                    napis += "marzec, ";
                case 4:
                    napis += "kwiecień, ";
                case 5:
                    napis += "maj, ";
                case 6:
                    napis += "czerwiec, ";
                case 7:
                    napis += "lipiec, ";
                case 8:
                    napis += "sierpień, ";
                case 9:
                    napis += "wrzesień, ";
                case 10:
                    napis += "październik, ";
                case 11:
                    napis += "listopad, grudzień.";
            }

            System.out.print("Do końca roku czekają Cię jeszcze miesiące: " + napis);
        }
    }
}
