package viikko3;

import java.util.Scanner;

public class Opintopisteet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anna lukukausien määrä: ");
        int semesters = scanner.nextInt();

        int totalPoints = 0;

        // empty space
        System.out.println();


        for (int i = 1; i <= semesters; i++) {
            System.out.print("Anna " + i + ". lukukauden opintopisteesi: ");
            int points = scanner.nextInt();
            totalPoints += points;
        }

        int targetPoints = semesters * 30;
        int degreeTotal = 210;
        int missingPoints = degreeTotal - totalPoints;

        // empty space
        System.out.println();

        System.out.println("Sinulla pitäisi olla tähän mennessä " + targetPoints + " opintopistettä.");
        System.out.println("Sinulla on " + totalPoints + " opintopistettä.");

        if (totalPoints < targetPoints) {
            System.out.println("Olet jäljessä tavoitteesta.");
        } else if (totalPoints == targetPoints) {
            System.out.println("Olet tavoitteessa.");
        } else {
            System.out.println("Olet edellä tavoitteesta.");
        }

        System.out.println("Tutkinnosta puuttuu vielä " + missingPoints + " opintopistettä.");

        scanner.close();
    }
}
