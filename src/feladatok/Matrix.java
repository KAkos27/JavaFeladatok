package feladatok;

import java.util.Random;

public class Matrix {

    static Random rnd = new Random();

    public static void main(String[] args) {
        final String[] BETUK = {"a", "b", "c", "d", "e", "f", "g", "h", "i"};
        int[] randomLista = new int[BETUK.length];

        for (int i = 0; i < BETUK.length; i++) {
            final int SZAM = rnd.nextInt(BETUK.length);

            int j = 0;
            while (j < BETUK.length && SZAM != randomLista[j]) {
                j++;
            }
            boolean tartalmazza = j < BETUK.length;

            if (!tartalmazza) {
                randomLista[i] = SZAM;
            }
        }

        int sortoresSzamolo = 0;
        for (int i = 0; i < BETUK.length; i++) {
            sortoresSzamolo++;
            if (sortoresSzamolo % 3 == 0) {
                System.out.println(BETUK[randomLista[i]] + " ");
            } else {
                System.out.print(BETUK[randomLista[i]] + " ");
            }
        }
    }
}
