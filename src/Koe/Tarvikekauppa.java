package Koe;

public class Tarvikekauppa {

    public static void main(String[] args) {
        Kiintolevy k1 = new Kiintolevy(22101, "Seagate", "HDD", 1000, 49.90);
        Kiintolevy k2 = new Kiintolevy(8088, "Samsung", "SSD", 500, 99.90);
        Kiintolevy k3 = new Kiintolevy(4242, "Fujitsu", "SSD", 2000, 149.00);
        Kiintolevy k4 = new Kiintolevy(72323, "WD");

        k4.setHinta(100.0);
        k4.setKapasiteetti(250);

        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);
        System.out.println(k4);
    }
}

