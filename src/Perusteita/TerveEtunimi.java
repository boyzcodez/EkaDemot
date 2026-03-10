package Perusteita;

import java.util.Scanner;

public class TerveEtunimi {
    public static void main(String[] args) {
        System.out.print("Anna etunimi: ");

        String nimi = "";

        Scanner input = new Scanner(System.in);
        nimi = input.nextLine();

        System.out.println("Terve " + nimi + "!");
        input.close();
    }
}
