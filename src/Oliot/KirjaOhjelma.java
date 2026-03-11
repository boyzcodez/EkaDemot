package Oliot;

import java.util.Scanner;

public class KirjaOhjelma {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna nimi: ");
        String nimi = lukija.nextLine();

        System.out.print("Anna isbn: ");
        String isbn = lukija.nextLine();

        System.out.print("Anna hinta: ");
        String hintaTeksti = lukija.nextLine().replace(",", ".");
        double hinta = Double.parseDouble(hintaTeksti);

        System.out.print("Anna julkaisuvuosi: ");
        int vuosi = Integer.parseInt(lukija.nextLine());

        System.out.println();

        Kirja kirja1 = new Kirja(nimi, isbn, hinta, vuosi);
        System.out.println(kirja1);

        System.out.println();

        Kirja kirja2 = new Kirja();
        kirja2.setNimi(nimi);
        kirja2.setIsbn(isbn);
        kirja2.setHinta(hinta);
        kirja2.setJulkaisuvuosi(vuosi);

        System.out.println("Nimi: " + kirja2.getNimi());
        System.out.println("Isbn: " + kirja2.getIsbn());
        System.out.println("Hinta: " + String.format("%.2f", kirja2.getHinta()).replace(".", ","));
        System.out.println("Julkaisuvuosi: " + kirja2.getJulkaisuvuosi());

        lukija.close();
    }
}
