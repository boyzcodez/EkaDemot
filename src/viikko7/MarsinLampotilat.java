package viikko7;

import java.util.Scanner;

public class MarsinLampotilat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int LOW = -140;
        final int HIGH = 20;
        final int INPUT_AMOUNT = 10;
        int inputs = 0;

        double sum = 0;
        int smallest = HIGH;
        int biggest = LOW;

        int[] arr = new int[INPUT_AMOUNT];

        while (inputs < INPUT_AMOUNT) {
            System.out.print("Syötä mittaus " + (inputs + 1) + "/10: ");
            int num = scanner.nextInt();

            if (num < LOW || num > HIGH){
                System.out.println("Anna lämpötila väliltä -140 - +20!\n");
            } else {
                arr[inputs] = num;
                inputs++;
                
                // gathering values
                sum += num;
                if (num < smallest) smallest = num;
                if (num > biggest) biggest = num;
            }
        }

        System.out.println();

        System.out.println("Mittausten keskiarvo: " + (double) sum / arr.length);
        System.out.println("Pienin mittaustulos: " + smallest);
        System.out.println("Suurin mittaustulos: " + biggest);

        scanner.close();
    }
}
