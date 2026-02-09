package viikko4;

import java.util.Scanner;

public class Lento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anna lennon numero: ");
        String flight = scanner.nextLine();

        if (flight.startsWith("AY")){
            String numberPart = flight.substring(2);
            int thirdDigit = Integer.parseInt(numberPart) / 100;
            
            if (thirdDigit == 1){
                System.out.println("Kaukolento");
            }
            else if (thirdDigit >= 2 && thirdDigit <= 6){
                System.out.println("Kotimaan lento");
            }
            else {
                System.out.println("Venäjän lento");
            }
        }
        else {
            System.out.println("Ei ole Finnairin lento");
        }

        scanner.close();
    }
}
