package Poikkeukset;

import java.util.Scanner;

public class KysyUudestaan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Syötä kokonaisluku: ");

        try {
            int num = scanner.nextInt();

            System.out.println("Syötit luvun " + num + ".");
            
        } catch (Exception e) {
            System.out.println("Virheellinen luku!\n");

            main(args);
        }

        scanner.close();
    }
}
