package Perusteita;

import java.util.Scanner;

public class Puoluetuki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int support = 148175;

        System.out.print("Anna kansanedustajien lukumäärä: ");
        int amount = scanner.nextInt();

        amount = amount * support;

        System.out.println("Puoluetuki on " + amount +" euroa");
        scanner.close();
    }
}
