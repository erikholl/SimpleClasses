package be.intecbrussel;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Exercise1Integer {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter a number");
        String input = keyboard.next();

        Integer intObj = Integer.parseInt(input);   // String >> Integer
        System.out.println(intObj + 3);             // add 3, print result

        System.out.println(Integer.SIZE);           // print # of bits
        System.out.println(Integer.BYTES);          // print # of bytes

    }
}
