package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListanSuurinLuku {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Integer> luvut = new ArrayList<Integer>();

        System.out.println("Syötä kokonaislukuja listalle (-1 lopettaa):");

        while (true) {
            int syote = lukija.nextInt();

            if (syote == -1) {
                break;
            } else {
                luvut.add(syote);
            }
        }
        lukija.close();

        System.out.println(); // Tyhjä rivi tulosteeseen

        int pienin = luvut.get(0);

        int indeksi = 0;
        while (indeksi < luvut.size()) {
            int luku = luvut.get(indeksi);
            if (pienin < luku) {
                pienin = luku;
            }

            indeksi = indeksi + 1;
        }

        System.out.println("Listan suurin luku: " + pienin);
    }
}
