package Perusteita;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ValmistuneenPalkka implements TestInterface {
    public static void main(String[] args) {

        final double palkka = 2900;

        System.out.print("Anna veroprosentti: ");

        double pros;
		Scanner input = new Scanner(System.in);
        pros = input.nextDouble();

        DecimalFormat formatter = new DecimalFormat("0.00");

		System.out.println("Lasketaan summa, joka jää verojen jälkeen kun veroprosentti on " + pros + "%.");

        double ans = palkka * (1 - (pros / 100));

        System.out.println("Nettopalkka on: " + formatter.format(ans));
        input.close();

        new ValmistuneenPalkka().JotainViesti();
    }
}
