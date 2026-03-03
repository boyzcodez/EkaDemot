package viikko7;

import java.util.Scanner;

public class MerkkijononPalat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kirjoita lause: ");
        String sentence = scanner.nextLine();
        scanner.close();

        String[] words = sentence.split(" ");

        System.out.println();

        for (String string : words) {
            System.out.println(string);
        }
    }
}
