package Merkkijono;

import java.util.Scanner;

public class Tuotteet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anna tuotenumero: ");
        String productNumber = scanner.nextLine().trim();

        System.out.print("Anna tuotteen nimi: ");
        String name = scanner.nextLine().trim().toUpperCase();

        System.out.print("Anna tuotteen hinta: ");
        String price = scanner.nextLine().trim();

        System.out.print("Anna tuotteen kuvaus: ");
        String description = scanner.nextLine().trim();

        // empty space
        System.out.println("");
        System.out.println("");

        System.out.println("Numero: " + productNumber);
        System.out.println("Nimi: "+ name);
        System.out.println("Hinta: " + price);
        if (!description.isBlank()) System.out.println("Kuvaus: " + description);

        scanner.close();
    }
}
