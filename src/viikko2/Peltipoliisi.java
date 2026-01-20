package viikko2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Peltipoliisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nopeusRajoitus = 80;

        System.out.print("Anna nopeutesi: ");
        int nopeus = scanner.nextInt();

        if (nopeus <= nopeusRajoitus){
            System.out.println("Ei sakkoja");
        } else if (nopeus <= nopeusRajoitus + 20) {
            System.out.println("Rikesakko");
        }
        else {
            System.out.println("Päiväsakko");
            System.out.print("Anna nettokuukausitulosi: ");
            double tulot = scanner.nextDouble();

            double sakko = (tulot-255)/60;

            if (sakko < 6){
                sakko = 6;
            }

            DecimalFormat form = new DecimalFormat("0.00");

            System.out.println("Päiväsakon määrä on " + form.format(sakko) + " euroa");
        }

        
        scanner.close();

    }
}
