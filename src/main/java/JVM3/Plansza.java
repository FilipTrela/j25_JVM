package JVM3;

/**
 * Klasa służy do stworzenia oraz wypisania talbicy z charami "#" oraz wypełnianiu jej znakami.
 * Istnieje w niej metoda która sprawdza czy tablica jest w pełni wypisana.
 * Wielkość tablicy ustanowiona na "sztywno".
 */
public class Plansza {
    private boolean[][] tablica;

    /**
     * Konstruktor który inicjalizuje taliblice boolean'ów podanymi parametrami na sztywno,
     * nie przyjmuje żadnych parametrów.
     */
    public Plansza() {
        tablica = new boolean[3][3];
    }

    /**
     * Metoda przyjmuje
     * @param liczba
     * i zmienia  jedną z 9 fals'ów w tablicy na true
     */
    public void zaznacz(int liczba) {
        if (liczba > 9 || liczba < 1) {
            return;
        }
        int wiersz = 0, kolumna = 0;
        if (liczba >= 1 && liczba <= 3) {
            wiersz = 0;
            kolumna = liczba - 1;
        } else if (liczba >= 4 && liczba <= 6) {
            wiersz = 1;
            kolumna = liczba - 4;
        } else if (liczba >= 7 && liczba <= 9) {
            wiersz = 2;
            kolumna = liczba - 7;
        }

        tablica[wiersz][kolumna] = true;
    }

    /**
     * Metoda wypisuje tablice.
     */
    public void wypisz() {
        StringBuilder sb = new StringBuilder();
        sb.append("#####\n");
        wypiszWiersz(sb, 0);
        wypiszWiersz(sb, 1);
        wypiszWiersz(sb, 2);
        sb.append("#####\n");
        sb.append("\n\n");
        System.out.println(sb.toString());
    }

    /**
     * Metoda przyjmuje
     * @param sb stringBuilder'a oraz,
     * @param row int który określa który rząd ma wypisać.
     *
     */
    private void wypiszWiersz(StringBuilder sb, int row) {
        sb.append("#");
        for (int i = 0; i < 3; i++) {
            if (tablica[row][i]) {
                sb.append("#");
            } else {
                sb.append(" ");
            }
        }
        sb.append("#\n");
    }

    /**
     * Metoda zwraca booleana czy jest Kompletna
     * @return
     */
    public boolean jestKompletna() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!tablica[i][j]) return false;
            }
        }
        return true;
    }
}