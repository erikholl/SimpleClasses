package be.intecbrussel;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.Duration;
import java.time.Period;

public class Exercise6Duration {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1981, 8, 12);
        LocalDate now = LocalDate.now();

        Period period = Period.between(birthDate, now);
        System.out.println("Rounded to an integer value with lower absolute value, there is a difference of " + period.getDays() + " days between the day-of-month of your birthdate (" + birthDate.getDayOfMonth() + ") and the current day-of-month (" + now.getDayOfMonth() + ").");
        System.out.println(("Rounded to an integer value with lower absolute value, there is a difference of " + period.getMonths() + " months between the month-of-year of your birthdate (" + birthDate.getMonth() + ") and the current month-of-year (" + now.getMonth() + ")."));
        System.out.println("Rounded to an integer value with lower absolute value, there is a difference of " + period.getYears() + " years between the year of your birthdate (" + birthDate.getYear() + ") and the current year (" + now.getYear() + ").");
        // if you ask me, the day and month calculations like this are useless..

        long totalDays = ChronoUnit.DAYS.between(birthDate, now);
        long totalWeeks = totalDays / 7;
        long totalMonths = ChronoUnit.MONTHS.between(birthDate, now);

        System.out.println("total days since birthdate: " + totalDays);
        System.out.println("total weeks since birthdate: " + totalWeeks);
        System.out.println("total months since birthdate: " + totalMonths);

    }
}
