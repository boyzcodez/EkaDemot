package Vaihtoehtorakenne;

import java.util.Scanner;

public class Katsastus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hinta = 0;

        System.out.print("Onko 1=katsastus, 2=jälkitarkastus: ");
        int vast = scanner.nextInt();

        if (vast == 2){
            hinta = 30;
        }
        else{
            hinta = 50;
      

        System.out.print("Mitataanko päästöt 0=ei, 1=kyllä: ");
        vast = scanner.nextInt();

        if (vast == 1){
            System.out.print("Onko auto 0=bensa, 1=diesel: ");
            vast = scanner.nextInt();

            if (vast == 0) {
                hinta += 22;
            }
            else {
                hinta += 31;
            }
        }
      }

        System.out.print("Hinta on " + hinta);
        scanner.close();

    }
}
