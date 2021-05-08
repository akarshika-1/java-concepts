package java_8.DateAndTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CurrentSystemDateAndTime {

    public static void main(String[] args) {
        //to print current system date
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        int dd = localDate.getDayOfMonth();
        int mm = localDate.getMonthValue();
        int yyyy = localDate.getYear();
        System.out.println(dd+"/"+mm+"/"+yyyy);
        System.out.printf("%d-%d-%d", dd, mm, yyyy);
        System.out.println();

        //to print current system time
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        int h = localTime.getHour();
        int m = localTime.getMinute();
        int s = localTime.getSecond();
        int n = localTime.getNano();
        System.out.printf("%d:%d:%d:%d", h,m,s,n);
        System.out.println();

        //to print both current system date and time
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
