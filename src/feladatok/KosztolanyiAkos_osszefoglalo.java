package feladatok;

import java.util.Random;
import java.util.Scanner;

public class KosztolanyiAkos_osszefoglalo {

    static Random rnd = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        final int SZAM = rnd.nextInt(3, 11);
        String betu;

        do {
            System.out.print("Adj meg egy betűt!: ");
            betu = sc.nextLine();
        } while (betu.length() > 1);

        String kiiras = "";
        for (int i = 0; i < SZAM; i++) {
            kiiras = i == SZAM - 1 ? kiiras + betu : kiiras + (betu + ", ");
        }
        System.out.println(kiiras);

        final int DB = 5;
        double[] tomb = new double[DB];
        final double OSZTAS = 1 / 3;

        tomb[0] = Math.PI;
        tomb[1] = Math.E;
        tomb[2] = OSZTAS;

        for (int i = 3; i < DB; i++) {
            tomb[i] = rnd.nextDouble(10.11, 19.51) * 10;
            tomb[i] = (int) tomb[i];
            tomb[i] = (double) tomb[i] / 10;
        }

        String tombSzoveg = "";
        for (int i = 0; i < DB; i++) {
            tombSzoveg = tomb[i] > 0 ? tombSzoveg + (tomb[i] + "\n") : tombSzoveg + "";
        }
        System.out.println(tombSzoveg);

    }

}
