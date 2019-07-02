package JVM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String komenda;
        do {
            komenda = scanner.nextLine();
            System.out.println("Hello World!");

        } while (!komenda.equalsIgnoreCase("100"));
    }
}
