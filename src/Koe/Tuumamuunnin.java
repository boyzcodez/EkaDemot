package Koe;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tuumamuunnin {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat dcf = new DecimalFormat("0.0");
        

        while (true) {
            System.out.print("Anna tuuma: ");
            String tuuma = scanner.nextLine();

            double liukuLuku = murtolukuLiukuluvuksi(tuuma);

            if (liukuLuku == 0) break;

            double milli = tuumatMillimetreiksi(liukuLuku);

            System.out.println(tuuma + " tuumaa on " + dcf.format(milli) + " mm" + "\n");
        }

        scanner.close();
    }

    static double murtolukuLiukuluvuksi(String tuuma){

        String[] stringNums = tuuma.split(" ");

        if (stringNums.length > 1) {
            Double num = Double.parseDouble(stringNums[0]);

            String[] nums = stringNums[1].split("/");

            double eka = Double.parseDouble(nums[0]);
            double toka = Double.parseDouble(nums[1]);
            return num + eka / toka;
        }
        else {
           try {
            Double num = Double.parseDouble(tuuma);

            return num;
            } catch (Exception e) {
                String[] nums = tuuma.split("/");

                        double eka = Double.parseDouble(nums[0]);
                        double toka = Double.parseDouble(nums[1]);
                        return eka / toka;
            } 
        }

        

        
    }

    static double tuumatMillimetreiksi(double tuuma){
        return tuuma * 25.4;
    }
}
