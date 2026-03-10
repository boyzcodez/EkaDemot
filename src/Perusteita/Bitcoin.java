package Perusteita;

import java.util.Scanner;

public class Bitcoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double mult = 15.06;

        System.out.println("Anna määrä jolla ostit Bitcoineja: ");
        double amount = scanner.nextDouble();

        amount = amount * mult - amount;

        System.out.println("Bitcoin tuotti vuodessa " + amount + " euroa");

        scanner.close();
    }
}
