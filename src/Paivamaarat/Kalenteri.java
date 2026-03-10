package Paivamaarat;


import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class Kalenteri {
    public static void main(String[] args) {

        final String WEEK = "Ma Ti Ke To Pe La Su";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Syötä vuosi: ");
        int year = scanner.nextInt();

        System.out.print("Syötä kuukausi: ");
        int month = scanner.nextInt();
        scanner.close();

        LocalDate firstDay = LocalDate.of(year, month, 1);
        int startColumn = firstDay.getDayOfWeek().getValue(); // 1=Mon ... 7=Sun

        YearMonth ym = YearMonth.of(year, month);
        int daysInMonth = ym.lengthOfMonth();

        System.out.println();

        System.out.println(WEEK);

        // Print leading spaces
        for (int i = 1; i < startColumn; i++) {
            System.out.print("   ");
        }

        int column = startColumn;

        // Print days
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%-3d", day);

            if (column % 7 == 0) {
                System.out.println();
            }
            column++;
        }
    }
}
