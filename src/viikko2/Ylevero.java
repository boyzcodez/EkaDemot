package viikko2;

import java.util.Scanner;

public class Ylevero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anna vuositulosi ja ikäsi: ");
        double tulo = scanner.nextDouble();
        int ika = scanner.nextInt();

        if (ika < 18){
            System.out.println("Ylevero on 0,00");
        } 
        else{
            double vero = tulo * 0.0068;

            if (vero < 140 && vero > 70){
                vero = 140;
            } else {
                vero = 0.0;
            }
            System.out.println("Ylevero on " + vero);
        }

        scanner.close();
    }
}
