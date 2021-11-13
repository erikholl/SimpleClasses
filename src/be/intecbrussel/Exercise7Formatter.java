package be.intecbrussel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise7Formatter {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter a date - format DD/MM/YYYY");
        String userDateInput = keyboard.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate userDate = LocalDate.parse(userDateInput, formatter);

        System.out.println(userDate);
    }
}
