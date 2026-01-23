package viikko1;

import java.util.Scanner;

public class Cooper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double roundLength = 400;

        System.out.print("Anna juostu matka: ");
        double distance = scanner.nextDouble();

        double rounds = distance / roundLength;

        System.out.print("Kokonaisia " + (int)roundLength + " metrin kierroksia " + (int)rounds);

        scanner.close();
    }
}
