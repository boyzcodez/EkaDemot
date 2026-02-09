package viikko4;

import java.util.Scanner;

public class Lumi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String BreakLine = "LOPPU";
        final String HighlightName = "lumi";

        String name = "";
        int amount = 0;
        int lumiAmount = 0;

        while (!name.contentEquals(BreakLine)) {
            System.err.print("Anna nimi: ");
            name = scanner.next();

            if (!!!name.contentEquals(BreakLine))
                amount++;
            
            if (name.toLowerCase().contentEquals(HighlightName))
                lumiAmount++;
            
        }
        
        System.out.println("Nimiä oli " + amount + " kappaletta.");
        System.out.println("Nimi Lumi esiintyi " + lumiAmount + " kertaa.");

        scanner.close();

    }
}
