package viikko6;

import java.util.Scanner;

public class Summaaja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            try {
                System.out.print("Syötä seuraava luku (0 lopettaa): ");
                String input = scanner.nextLine();

                int num = Integer.parseInt(input);

                if (num == 0) break;

                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Virheellinen syöte!\n");
            }
            
        }

        System.out.println("\nLukujen summa on " + sum + ".");
        scanner.close();
    }
}
