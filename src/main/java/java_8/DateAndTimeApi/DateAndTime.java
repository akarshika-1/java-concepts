package java_8.DateAndTimeApi;

import java.time.LocalDateTime;
import java.time.Month;

public class DateAndTime {

    public static void main(String[] args) {
        //to print a particular date and time
        LocalDateTime localDateTime = LocalDateTime.of(1995, Month.MAY, 28, 12, 45);
        System.out.println(localDateTime);
        System.out.println("After 6 months : "+localDateTime.plusMonths(6));
        System.out.println("Before 6 months : "+localDateTime.minusMonths(6));

        //Similarly, plus days , minus days, plus weeks, minus weeks etc, a lot of methods are present
    }
}
