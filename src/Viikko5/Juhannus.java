package viikko5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Juhannus {
    public static void main(String[] args) {
        String juhannus = ".6.";
        int day = 20;

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d.M.yyyy.");

        System.out.print("Syötä vuosi: ");
        String ans = scanner.nextLine();
        String trueAns = day + juhannus + ans;

        LocalDate date = LocalDate.parse(trueAns, dtf);

        while (!date.getDayOfWeek().equals(DayOfWeek.SATURDAY)){
            day++;
            trueAns = day + juhannus + ans;
            date = LocalDate.parse(trueAns, dtf);
        }

        System.out.println("Juhannus on " + dtf.format(date));

        scanner.close();
    }
}
