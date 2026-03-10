package Poikkeukset;

public class Kello {

    private int tunnit;
    private int minuutit;

    public Kello(int tunnit, int minuutit){

        if (tunnit < 0 || tunnit > 23 || minuutit < 0 || minuutit > 59){
            throw new IllegalArgumentException("Virheellinen kellonaika");
        }

        this.tunnit = tunnit;
        this.minuutit = minuutit;
    }

    public void lisaaMinuutit(int mins){
        if (mins < 0) {
            throw new IllegalArgumentException("Virheellinen kellonaika");
        }

        minuutit += mins;

        tunnit += minuutit / 60;
        minuutit = minuutit % 60;

        tunnit = tunnit % 24;
    }

    public int getTunnit(){
        return tunnit;
    }
    public int getMinuutit(){
        return minuutit;
    }
    
    public void setTunnit(int tunnit) {
        if (tunnit < 0 || tunnit > 23) {
            throw new IllegalArgumentException("Virheellinen kellonaika");
        }
        this.tunnit = tunnit;
    }
    public void setMinuutit(int minuutit) {
        if (minuutit < 0 || minuutit > 59) {
            throw new IllegalArgumentException("Virheellinen kellonaika");
        }
        this.minuutit = minuutit;
    }

    @Override
    public String toString(){
        return tunnit + ":" + String.format("%02d", minuutit);
    }
}
