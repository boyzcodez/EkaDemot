package Koe;

import java.util.Scanner;

public class LukujenJarjestys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean kasvava = false;
        boolean epa = false;

        System.out.println("Syötä kymmenen kokonaislukua: ");
        String[] nums = scanner.nextLine().split(" ");

        scanner.close();

        int eka = Integer.parseInt(nums[0]);
        int toka = Integer.parseInt(nums[1]);

        if (eka < toka) kasvava = true;

        int[] intnums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            intnums[i] = Integer.parseInt(nums[i]);
        }

        int entinen = eka;

        for (int f = 0; f < nums.length; f++){

            if (kasvava) {
                if (intnums[f] < entinen) {
                    epa = true;
                    break;
                }
            } else {
                if (intnums[f] > entinen) {
                    epa = true;
                    break;
                }
            }

            entinen = intnums[f];
        }

        System.out.println();

        if (epa){
            System.out.println("Luvut ovat epäjärjestyksessä.");
        } else if (kasvava) {
            System.out.println("Luvut ovat kasvavassa järjestyksessä.");
        }
        else {
            System.out.println("Luvut ovat laskevassa järjestyksessä.");
        }

    }
}
