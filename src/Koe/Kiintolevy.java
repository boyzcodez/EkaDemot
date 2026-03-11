package Koe;

import java.text.DecimalFormat;

public class Kiintolevy {

    private int tuotekoodi;
    private String merkki;
    private String tyyppi;
    private int kapasiteetti;
    private double hinta;

    public Kiintolevy(int tuotekoodi, String merkki){
        this.tuotekoodi = tuotekoodi;
        this.merkki = merkki;

        tyyppi = "SSD";
        hinta = 0;
    }
    
    public Kiintolevy(int tuotekoodi, String merkki, String tyyppi, int kapasiteetti, double hinta){
        this.tuotekoodi = tuotekoodi;
        this.merkki = merkki;
        this.tyyppi = tyyppi;
        this.kapasiteetti = kapasiteetti;

        if (hinta < 0) hinta = 0;
        this.hinta = hinta;
    }


    public int getTuotekoodi(){
        return tuotekoodi;
    }
    public void setTuotekoodi(int tuotekoodi){
        this.tuotekoodi = tuotekoodi;
    }

    public String getMerkki(){
        return merkki;
    }
    public void setMerkki(String merkki){
        this.merkki = merkki;
    }

    public String getTyyppi(){
        return tyyppi;
    }
    public void setTyyppi(String tyyppi){
        this.tyyppi = tyyppi;
    }

    public int getKapasiteetti(){
        return kapasiteetti;
    }
    public void setKapasiteetti(int kapasiteetti){
        this.kapasiteetti = kapasiteetti;
    }

    public double getHinta() {
        return hinta;
    }
    public void setHinta(double hinta){
        if (hinta < 0) hinta = 0;
        this.hinta = hinta;
    }

    @Override
    public String toString(){
        DecimalFormat dcf = new DecimalFormat("0.00");

        String koko = " Gt";
        if (kapasiteetti >= 1000){
            kapasiteetti = kapasiteetti / 1000;
            koko = " Tt";
        }

        return merkki + " " + tyyppi + ", "+ kapasiteetti + koko + ", " + dcf.format(hinta) + " euroa";
    }
}
