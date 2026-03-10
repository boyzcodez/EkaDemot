package Perusteita;

import java.util.Scanner;

public class Pikavippi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Anna lainasumma euroissa: ");
        double money = scanner.nextDouble();

        System.out.print("Montako vuotta (1 tai 2): ");
        double years = scanner.nextInt();

        System.out.print("Lainan korko (41% tai 37%): ");
        double procent = scanner.nextInt();

        double loan = money * ((procent / 100) * years);

        System.out.print("Lainattu raha maksoi " + loan + " euroa");

        scanner.close();
    }
}
