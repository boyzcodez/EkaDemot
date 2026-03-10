package Taulukot;

import java.util.Scanner;

public class SanojenVaihtaminen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kirjoita lause: ");
        String[] words = scanner.nextLine().split(" ");

        System.out.println();

        System.out.println("Mitkä sanat vaihdetaan keskenään?");
        String[] nums = scanner.nextLine().split(" ");


        String wordToChange1 = words[Integer.parseInt(nums[0])];
        words[Integer.parseInt(nums[0])] = words[Integer.parseInt(nums[1])];
        words[Integer.parseInt(nums[1])] = wordToChange1;

        System.out.println();

        for (String string : words) {
            System.out.print(string + " ");
        }

        scanner.close();
    }
}
