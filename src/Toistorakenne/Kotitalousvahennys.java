package Toistorakenne;

import java.util.Scanner;

public class Kotitalousvahennys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalCompensation = 0.0;

        while (true) {
            System.out.print("Anna työkorvauksen määrä (0 lopettaa): ");
            double amount = scanner.nextDouble();

            if (amount == 0) {
                break;
            }

            totalCompensation += amount;
        }

        double deduction = totalCompensation * 50 / 100.0 - 100;

        if (deduction < 0) {
            deduction = 0;
        }

        if (deduction > 2400) {
            deduction = 2400;
        }

        System.out.printf("\nKotitalousvähennyksen määrä on %.2f euroa", deduction);

        scanner.close();
    }
}
