package be.intecbrussel;

import java.time.ZonedDateTime;
import java.time.ZoneId;

public class Exercise5TimeZones {
    public static void main(String[] args) {

        ZonedDateTime nowHere = ZonedDateTime.now();

        ZoneId londonZone = ZoneId.of("Europe/London");
        ZonedDateTime nowLondon = ZonedDateTime.now(londonZone);

        ZoneId sydneyZone = ZoneId.of("Australia/Sydney");
        ZonedDateTime nowSydney = ZonedDateTime.now(sydneyZone);

        ZoneId adelaideZone = ZoneId.of("Australia/Adelaide");
        ZonedDateTime nowAdelaide = ZonedDateTime.now(adelaideZone);

        ZoneId utcMin4 = ZoneId.of("UTC-4");
        ZonedDateTime nowUTCMin4 = ZonedDateTime.now(utcMin4);

        System.out.println(nowHere);
        System.out.println(nowLondon);
        System.out.println(nowSydney);
        System.out.println(nowAdelaide);
        System.out.println(nowUTCMin4);
    }
}
