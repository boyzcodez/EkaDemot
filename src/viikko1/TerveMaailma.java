package viikko1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TerveMaailma {

    public static void main(String[] args) {
        System.out.print("Terve anna nimi: ");

        Scanner scn = new Scanner(System.in);
        String i = scn.nextLine();

        System.out.println("nimesi on " + i);

        DecimalFormat df = new DecimalFormat("0.00");
        // hhmn2e
        System.out.println("Anna numero: ");
        double num = scn.nextDouble();

        System.out.println("Numero jonka annoit on: " + df.format(num));
        TokaDemo.main(args);

        scn.close();
    }
}
