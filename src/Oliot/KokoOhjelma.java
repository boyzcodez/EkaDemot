package Oliot;

import java.util.Scanner;

class Koko {

    private double pituus;
    private int paino;

    public Koko() {
    }

    public Koko(double pituus, int paino) {
        this.pituus = pituus;
        this.paino = paino;
    }

    public double getPituus() {
        return pituus;
    }

    public void setPituus(double pituus) {
        this.pituus = pituus;
    }

    public int getPaino() {
        return paino;
    }

    public void setPaino(int paino) {
        this.paino = paino;
    }

    public double getPainoindeksi() {
        return paino / (pituus * pituus);
    }

    public String toString() {
        return "Koko [pituus=" + pituus + ", paino=" + paino + "]";
    }
}

public class KokoOhjelma {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);

        Koko koko = new Koko();

        System.out.print("Anna pituus metreinä: ");
        String pituusTeksti = lukija.nextLine().replace(",", ".");
        double pituus = Double.parseDouble(pituusTeksti);

        System.out.print("Anna paino kiloina: ");
        int paino = Integer.parseInt(lukija.nextLine());

        koko.setPituus(pituus);
        koko.setPaino(paino);

        System.out.println("Pituus: " + String.format("%.2f", koko.getPituus()).replace(".", ","));
        System.out.println("Paino: " + koko.getPaino());
        System.out.println("Painoindeksi: " + String.format("%.2f", koko.getPainoindeksi()).replace(".", ","));

        lukija.close();
    }
}
