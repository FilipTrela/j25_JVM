package JVM2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer ilosc = null;
        if (args.length >= 1) {
            ilosc = Integer.parseInt(args[0]);
        } else {
            ilosc = null;
        }
        while (ilosc == null) {
            System.out.println("Podaj ile razy mam wypisać Hello World!");
            String komenda = scanner.nextLine();
            try {
                int iloscObiegow = Integer.parseInt(komenda);
                ilosc = iloscObiegow;
            } catch (IllegalArgumentException iea) {
                System.err.println("To nie jest liczba");
                System.out.println();
            }
        }
        if (args.length >= 1) {

        }
        for (int i = 0; i < ilosc; i++) {
            System.out.println((i + 1) + ". Hello World!");

        }


    }
}
