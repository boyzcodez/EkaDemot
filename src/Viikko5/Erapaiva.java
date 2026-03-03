package viikko5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Erapaiva {
    public static void main(String[] args) {

        final int EXPIRATION = 14;

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-M-d");

        System.out.print("Anna laskun päivämäärä (vvvv-kk-pp): ");
        String ans = scanner.nextLine();

        LocalDate date = LocalDate.parse(ans, dtf);
        date = date.plusDays(EXPIRATION);

        System.out.println("Eräpäivä on " + date);

        scanner.close();
    }
}
