package be.intecbrussel;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Exercise4LocalDateAndLocalTime {

    public static void main(String[] args) {
        // a birthdate 12.08.1981
        LocalDate birthDate = LocalDate.of(1981, 8, 12);
        LocalDate startOfBirthYear = LocalDate.of(1981, 1, 1);

        // diff days birthdate vs start of year
        long deltaBirthDateMinStartOfYear =
                ChronoUnit.DAYS.between(startOfBirthYear, birthDate);
        System.out.println("Birthdate " + birthDate + " was day " + deltaBirthDateMinStartOfYear + " of that year..");

        // day of month
        int dayOfMonth = birthDate.getDayOfMonth();
        System.out.println("..was day " + dayOfMonth + " of that month..");

        // day of week
        System.out.println("..fell on a " + birthDate.getDayOfWeek() + " that" +
                                   " year..");

        boolean leapYear = birthDate.isLeapYear();
        if (!leapYear) {
            System.out.println("..and that year was not a leapyear.");
        } else
            System.out.println("..and that year was a leapyear.");


    }
}
