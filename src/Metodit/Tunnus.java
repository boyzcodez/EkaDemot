package Metodit;

import java.util.Scanner;

public class Tunnus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tunnus tunnus = new Tunnus();

        System.out.print("Anna sukunimi: ");
        String suku = scanner.nextLine();

        System.out.print("Anna etunimi: ");
        String etu = scanner.nextLine();

        scanner.close();

        System.out.println("Tunnus on " + tunnus.teeTunnus(etu, suku));
    }

    String teeTunnus(String etu, String suku){

        String etuSub = etu.substring(0, 3).toLowerCase();
        String sukuSub = suku.substring(0,3).toLowerCase();
        

        return sukuSub + etuSub;
    }

}
