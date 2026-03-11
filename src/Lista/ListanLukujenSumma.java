package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListanLukujenSumma {
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

        int yht = 0;

        for (Integer integer : luvut) {
            yht += integer;
        }
        System.out.println("Summa: " + yht);
    }
}
