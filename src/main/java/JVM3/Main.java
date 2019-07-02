package JVM3;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Plansza plansza = new Plansza();
        Scanner scanner = new Scanner(System.in);
        String pole;
        do {
            plansza.wypisz();
            System.out.println("Podaj pole do zamalowania.");
            pole = scanner.nextLine();
            try {
                plansza.zaznacz(Integer.parseInt(pole));
            } catch (IllegalArgumentException iea) {
                System.err.println("To nie jest liczba");
                System.out.println();
            }

        } while (!plansza.jestKompletna());
        plansza.wypisz();
        System.out.println("Gratulacje!! Witaj w Matrix!!");

    }
}
