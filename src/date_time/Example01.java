package date_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Example01 {
    public static void main(String[] args) {
        String date = LocalDate.parse("2014-05-04")
                .format(DateTimeFormatter.ISO_DATE_TIME); // EXCEPTION
        // Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: HourOfDay
        System.out.println(date);

    }
}
