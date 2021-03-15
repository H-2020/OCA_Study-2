package date_time;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Example04 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2014, 02,03, 01, 02);
        dt = dt.plusHours(30);
        dt = dt.plusMinutes(1);
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
    }

}
