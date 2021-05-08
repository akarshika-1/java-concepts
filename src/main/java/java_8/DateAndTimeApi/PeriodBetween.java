package java_8.DateAndTimeApi;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodBetween {

    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1993, Month.OCTOBER, 1);
        LocalDate today = LocalDate.now();
        Period p1 = Period.between(birthDate, today);
        System.out.println("Age is : "+p1.getYears()+" years "+p1.getMonths()+" months "+p1.getDays()+" days");

        LocalDate deathDate = LocalDate.of(1993+65, Month.OCTOBER, 1);
        Period p2 = Period.between(today, deathDate);
        int days = p2.getYears()*365 + p2.getMonths()*30+p2.getDays();
        System.out.println("Days remaining : "+days);


    }
}
