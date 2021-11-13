package be.intecbrussel;

import java.time.Instant;
import java.time.ZoneId;
//import java.time.LocalDateTime;
import java.time.ZonedDateTime;
//import java.util.TimeZone;

public class Exercise2Instant {

    public static void main(String[] args) {

        String timeZone = ZoneId.systemDefault().getId();   // get timezone
        Instant now = Instant.now();                        // create instant
        ZonedDateTime localNow = now.atZone(ZoneId.of(timeZone)); // convert

        System.out.println(localNow);

        Instant later = now.plusSeconds(7);     // add secs
        later = later.plusMillis(5);            // add millis
        later = later.plusNanos(3);             // add nanos
        ZonedDateTime localLater = later.atZone(ZoneId.of(timeZone)); // convert

        System.out.println(localLater);
    }
}
