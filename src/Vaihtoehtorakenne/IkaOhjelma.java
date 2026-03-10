package Vaihtoehtorakenne;

import java.util.Scanner;

public class IkaOhjelma {
    public static void main(String[] args) {
        System.out.print("Anna ikäsi: ");

        Scanner scanner = new Scanner(System.in);
        int ika = scanner.nextInt();

        if (ika >= 18) {
            System.out.println("Olet täysi-ikäinen");
        } else {
            System.out.println("Olet ala-ikäinen");
        }

        scanner.close();
    }
}
