package viikko2;

import java.util.Scanner;

public class Ylinopeus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ylinopeus = 120;

        System.out.print("Kerronopeus: ");
        int luku = scanner.nextInt();

        if (luku > ylinopeus){
            System.out.println("Ylinopeussakko!");
        }

        scanner.close();
    }
}
