package Tiedostot;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// path to a text file
// src/Tiedostot/jotain.txt

public class WordCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Anna tiedoston nimi: ");
        String fileName = input.nextLine();

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                lineCount++;

                charCount += line.length();

                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            fileScanner.close();

            System.out.println("\nTiedostossa on:");
            System.out.println(lineCount + " riviä");
            System.out.println(wordCount + " sanaa");
            System.out.println(charCount + " merkkiä");

        } catch (FileNotFoundException e) {
            System.out.println("Tiedostoa ei löytynyt.");
        }

        input.close();
    }
}
