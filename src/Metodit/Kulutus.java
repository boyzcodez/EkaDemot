package Metodit;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kulutus {

    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Kulutus kulutus = new Kulutus();

        int kil = kulutus.kysyKilometrit();

        double tank = kulutus.kysyTankkaus();

        double kulu = kulutus.laskeKulutus(kil, tank);

        kulutus.naytaKulutus(kulu);
    }




    int kysyKilometrit(){
        System.out.print("Anna ajetut kilometrit: ");
        int num = scanner.nextInt();
        return num;
    }

    double kysyTankkaus(){
        System.out.print("Anna tankattu määrä: ");
        double num = scanner.nextDouble();
        return num;
    }

    double laskeKulutus(int kilometrit, double tankattu){
        return tankattu / kilometrit * 100;
    }

    void naytaKulutus(double kulutus) {
        System.out.println("Kulutus/100km on " + df.format(kulutus) + " litraa");
    }

}
