package one;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Daty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj datę w formacie yyy-mm-dd hh:mm");

        String data = scanner.nextLine();
        String trim = data.trim();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime localDateTime = LocalDateTime.parse(trim, formatter);

        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of("CET"));

        ZonedDateTime dayAfter8h = zonedDateTime.plusHours(8);

        System.out.println("Do domu idziesz o " + dayAfter8h.format(formatter));

    }
}
