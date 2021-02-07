package core_java_api.example01;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

public class DateApp {
    public static void main(String[] args) {
        System.out.println(LocalDate.of(2015, Calendar.APRIL,1));
        System.out.println(LocalDate.of(2015, Month.APRIL,1));
        System.out.println(LocalDate.of(2015, 3, 1));
        System.out.println(LocalDate.of(2015, 4, 1));
        // System.out.println(new LocalDate(2015, 3, 1)); --> not allowed
    }
}
