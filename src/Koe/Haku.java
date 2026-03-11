package Koe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Haku {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<String> lista = new ArrayList<String>();
        List<String> lista2 = new ArrayList<String>();

        final int haluttuMaara = 5;

        for (int i = 0; i < haluttuMaara; i++){
            System.out.print("Kirjoita sana " + (i+1) + "/5: ");
            lista.add(lukija.nextLine());
        }

        System.out.println(); // tyhjä rivi

        System.out.print("Anna etsittävä termi: ");
        String etsittava = lukija.nextLine();

        System.out.println(); // tyhjä rivi

        int count = 0;

        for (String string : lista) {
            if (string.contains(etsittava)) {
                count++;
                lista2.add(string);
            }
        }

        System.out.println("Löytyi " + count + " osumaa:");
        for (String string : lista2) {
            System.out.println(string);
        }

        lukija.close();
    }
}
