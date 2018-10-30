package one;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Daty2 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2020, 10, 10);
        LocalTime localTime = LocalTime.of(20, 00);

        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        LocalDateTime localDateTime2 = LocalDateTime.of(2021,04, 12, 20, 55);

        LocalDateTime after20Days = localDateTime.plusDays(20);
        LocalTime before100Min = localTime.minusMinutes(100);


    }
}
