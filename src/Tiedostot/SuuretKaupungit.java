package Tiedostot;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuuretKaupungit {

    public static void main(String[] args) throws Exception {

        List<String> rivit = Files.readAllLines(Paths.get("kaupungit.csv"));
        List<String> kaupungit = new ArrayList<>();

        for (int i = 1; i < rivit.size(); i++) { // ohitetaan otsikkorivi
            String rivi = rivit.get(i);
            String[] osat = rivi.split(",");

            String nimi = osat[0];
            int vakiluku = Integer.parseInt(osat[1]);

            if (vakiluku >= 10000) {
                kaupungit.add(nimi);
            }
        }

        Collections.sort(kaupungit);

        for (String kaupunki : kaupungit) {
            System.out.println(kaupunki);
        }
    }
}