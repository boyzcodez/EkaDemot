package Poikkeukset;

import java.util.Scanner;

public class ArvonTarkastus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Syötä luku väliltä 0-23: ");
        int num = scanner.nextInt();
        scanner.close();

        if (!(num >= 0 && num <= 23)){
            throw new IllegalArgumentException();
        }
        else {
            System.out.println("Luku " + num + " on sallittu.");
        }
    }
}
