package be.intecbrussel;

import java.time.DayOfWeek;
import java.util.Scanner;

public class Exercise3MonthAndDayOfWeekEnums {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter a number from 1-7 to select day of week " +
                                   "(1 = Monday, 2 = Tuesday, etc.)");
        int userDayNumber = keyboard.nextInt();

        if (userDayNumber < 1 || userDayNumber > 7) {
            System.out.println("number entered not between 1 and 7. program " +
                                       "exits.");
        } else {
            DayOfWeek dayOfWeek;
            System.out.println("enter an integer as number of days to add");
            int userDaysToAdd = keyboard.nextInt();
            if (userDaysToAdd < 0) {
                System.out.println("number entered not an integer. program " +
                                           "exits.");
            } else {
                int moduloSeven = (userDayNumber + userDaysToAdd) % 7;
                if (moduloSeven == 0) {
                    moduloSeven = 7;
                }
                dayOfWeek = DayOfWeek.of(moduloSeven);
                System.out.println("initial day plus # of days to add result " +
                                           "in " + dayOfWeek);
            }
        }
    }
}
