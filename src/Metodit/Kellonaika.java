package Metodit;

import java.util.Scanner;

public class Kellonaika {
    public static void main(String[] args) {
        Kellonaika k = new Kellonaika();

        String aika = k.kysyKellonaika();

        if (k.tarkastaKellonaika(aika)){
            System.out.println("Kellonaika on oikein");
        } else {
            System.out.println("Kellonaika on väärin");
        }
    }

    String kysyKellonaika(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anna kellonaika muodossa tt:mm: ");
        String aika = scanner.nextLine();

        scanner.close();

        return aika;
    }

    boolean tarkastaKellonaika(String kellonaika){

        String[] numerot = kellonaika.split(":");

        if (numerot.length > 2) 
            return false;

        try 
        {
            int num = Integer.parseInt(numerot[0]);
            if (num > 23 || num < 0)
                return false;
        } 
        catch (NumberFormatException e) 
        {
            return false;
        }

        try 
        {
            int num = Integer.parseInt(numerot[1]);
            if (num > 59 || num < 0)
                return false;
        } 
        catch (NumberFormatException e) 
        {
            return false;
        }

        return true;
    }
}
