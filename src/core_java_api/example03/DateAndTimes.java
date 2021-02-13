package core_java_api.example03;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateAndTimes {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

        /*System.out.println(shortDateTime.format(dateTime));
        System.out.println(shortDateTime.format(date));
        System.out.println(shortDateTime.format(time)); // UnsupportedTemporalTypeException

        // another way
        System.out.println(dateTime.format(shortDateTime));
        System.out.println(date.format(shortDateTime));
        System.out.println(time.format(shortDateTime)); // UnsupportedTemporalTypeException*/

        // using a pattern
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("hh:mm");
        System.out.println(f1.format(dateTime));
        // System.out.println(f.format(date)); // UnsupportedTemporalTypeException
        System.out.println(f1.format(time));

        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd MM yyyy hh:mm");
        System.out.println(f2.format(dateTime));

        // parsing dates and times
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("MM dd yyyy");

        LocalDate date1 = LocalDate.parse("01 02 2015", f3);
        LocalTime time1 = LocalTime.parse("20:02:44");

        System.out.println(date1);
        System.out.println(time1);


    }
}
