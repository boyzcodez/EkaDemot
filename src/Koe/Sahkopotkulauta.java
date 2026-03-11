package Koe;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Sahkopotkulauta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat dcf = new DecimalFormat("0.00");

        System.out.print("Syötä vuokrauksen aloitusaika: ");
        String alot = scanner.nextLine();

        System.out.print("Syötä vuokrauksen lopetusaika: ");
        String lop = scanner.nextLine();

        String[] alotNums = alot.split(":");
        String[] lopNums = lop.split(":");

        int alotTunti = Integer.parseInt(alotNums[0]);
        int lopTunti = Integer.parseInt(lopNums[0]);
        
        int count = 0;
        int mins = 0;

        if (alotTunti == lopTunti) 
        {
            mins = Integer.parseInt(lopNums[1]) - Integer.parseInt(alotNums[1]);
        } 
        else {
            while (true) {

            if (alotTunti == lopTunti) {
                break;
            }

            if (alotTunti == 24) {
                alotTunti = 0;
            }

            alotTunti++;
            count++;

            }
        }

        int alotMins = Integer.parseInt(alotNums[1]);
        int lopMins = Integer.parseInt(lopNums[1]);

        mins = 60 * count - alotMins + lopMins;

        double hinta = 1 + mins * 0.25;
        
        System.out.println("Vuokrauksen kesto: " + mins + " min");
        System.out.println("Veloitus: " + dcf.format(hinta) + " €");

        scanner.close();
    }
}
