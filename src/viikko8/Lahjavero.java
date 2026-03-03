package viikko8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lahjavero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Anna lahjan suuruus: ");
        double num = scanner.nextDouble();

        System.out.println("Lahjavero on " + df.format(laskeVero(num)) + " euroa");
        scanner.close();
    }

    public static double laskeVero(double arvo){

        double vero;
        double veroprosentti;
        double alaraja;

        if (arvo < 5000){
            return 0f;
        }

        if (arvo >= 5000 && arvo < 25000){
            vero = 100;
            veroprosentti = 0.08f;
            alaraja = 5000;
        } 
        else if (arvo >= 25000 && arvo < 55000) {
            vero = 1700;
            veroprosentti = 0.10f;
            alaraja = 25000;
        }
        else if (arvo >= 55000 && arvo < 200000) {
            vero = 4700;
            veroprosentti = 0.12f;
            alaraja = 55000;
        }
        else if (arvo >= 200000 && arvo < 1000000) {
            vero = 22100;
            veroprosentti = 0.15f;
            alaraja = 200000;
        }
        else {
            vero = 142100;
            veroprosentti = 0.17f;
            alaraja = 1000000;
        }

        return vero + (arvo - alaraja) * veroprosentti;
    }
}
