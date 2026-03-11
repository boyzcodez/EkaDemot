package Koe;

import java.util.Scanner;

public class Puhelinnumerot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anna puhelinnumero: ");
        String puh = scanner.nextLine();

        String[] jot = puh.split("");
        int[] nums = new int[jot.length];

        boolean lisaaEtu = false;

        try {
            for (int i = 0; i < jot.length; i++) {
            nums[i] = Integer.parseInt(jot[i]);
        }
        if (nums[0] == 0) {
                    if (nums[1] == 5 || nums[1] == 4) {
                        if (nums[2] == 0) {
                            lisaaEtu = true;
                        }
                    }
                }

        }
        catch (Exception e) {

        }
        

        if (lisaaEtu) {

            System.out.print("Numero korjattuna on: +358");

            for (int i = 1; i < jot.length; i++) {
                
                System.out.print(jot[i]);
            }
        }
        else {
            System.out.println("Numerossa ei löytynyt korjattavaa.");
        }

        scanner.close();
    }
}
