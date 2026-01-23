package viikko1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Maalaus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Anna huoneen leveys, pituus ja korkeus: ");
        double width = scanner.nextDouble();
        double length = scanner.nextDouble();
        double height = scanner.nextDouble();

        System.out.print("Montako neliötä maalaa litralla: ");
        double paint = scanner.nextDouble();

        double surfaceArea = 2 * (width * height) + 2 * (length * height);
        double neededPaint = surfaceArea / paint;

        System.out.print("Maalia tarvitaan " + df.format(neededPaint) + " litraa");

        scanner.close();
    }
}
