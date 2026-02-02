package viikko3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kilometrikorvaus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");

        final double price = 0.43;

        int input = 1;
        int value = 0;

        while (input > 0){
            System.out.print("Anna ajetut kilometrit (0 lopettaa): ");
            input = scanner.nextInt();

            value += input;
        }

        System.out.println("Yhteensä " + value + " kilometriä");
        System.out.println("Korvaus on " + format.format(value * price) + " euroa");

        scanner.close();
    }
}
