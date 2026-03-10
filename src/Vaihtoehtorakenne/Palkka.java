package Vaihtoehtorakenne;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Palkka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tyotmuuskust = 0.015;
        double tyoelakmaks;

        System.out.print("Anna palkka: ");
        double palkka = scanner.nextDouble();

        System.out.print("Anna veroprosentti: ");
        double prosentti = scanner.nextDouble();

        System.out.print("Anna ikä: ");
        int ika = scanner.nextInt();

        if (ika >= 53 && ika <= 62){
            tyoelakmaks = 0.0825;
        }
        else {
            tyoelakmaks = 0.0675;
        }

        double vero = palkka*prosentti / 100;
        double tyotVak = palkka * tyoelakmaks;
        double tyotmuus = palkka * tyotmuuskust;
        double jaa = palkka - vero - tyotVak - tyotmuus;

        DecimalFormat form = new DecimalFormat("0.00");

        System.out.println("");

        System.out.println("Bruttopalkka " + form.format(palkka));
        System.out.println("Veron osuus " + form.format(vero));
        System.out.println("Työeläkevakuutusmaksun osuus " + form.format(tyotVak));
        System.out.println("Työttömyysvakuutuksen osuus " + form.format(tyotmuus));
        System.out.println("Käteen jää " + form.format(jaa));

        scanner.close();

    }
}
