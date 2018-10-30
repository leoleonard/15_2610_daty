package one;

import java.time.*;
import java.util.Scanner;

import static java.time.Duration.between;

public class Dates {
    public static void main(String[] args) {

        LocalDate localDate2 = LocalDate.of(2020, 10, 10);

        LocalDate localDate = LocalDate.of(2020, 10, 10);
        LocalTime localTime = LocalTime.of(20, 0);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        LocalDateTime localDateTime2 = LocalDateTime.of(2020, 10, 10, 20, 0);
        LocalDateTime after30Days = localDateTime.plusDays(30);
        LocalTime before100Minutes = localTime.minusMinutes(100);

        ZoneId zoneId = ZoneId.of("Europe/Warsaw");
        ZonedDateTime start = ZonedDateTime.of(2018, 10, 27, 19, 0, 0, 0, zoneId);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);

        // różnica czasu w godzinach
        Duration duration = Duration.between(localDateTime, localDateTime2);
        // różnica czasu w dniach
        long hours = duration.toHours();
        Period period = Period.between(localDate, localDate2);
        int dats = period.getDays();
        int months = period.getMonths();

//        LocalDateTime from = LocalDateTime.from(instant);
//        LocalDate localDate = from.toLocalDate();
//
//
//        ZoneId zone = ZoneId.of("Europe/Warsaw");
//
//        ZonedDateTime start = ZonedDateTime.of(2018, 10, 27, 19, 0, 0, 0, zone);
//        ZonedDateTime end = ZonedDateTime.of(2018, 10, 28, 7, 0, 0, 0, zone);
//
//        DateTimeFormatter formatter;
//
//        Duration duration = Duration.between(start, end);
//        System.out.println(duration);
//        java.time.LocalDate localDate;
//        java.time.LocalTime localTime;
//        java.time.LocalDateTime localDateTime;
//
//        Instant instant = Instant.now();
//
//        LocalDate.parse("");
//
//        Duration.between(instant, instant);
//
//        DateTimeFormatter dateTimeFormatter;
//
//        ZonedDateTime zonedDateTime;

//        zonedDateTime.getZone();

    }
}
