package java_8.DateAndTimeApi;

import java.time.Year;
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Year year = Year.of(n);
        if(year.isLeap()){
            System.out.println("It is leap year");
        }else{
            System.out.println("It is not leap year");
        }
    }
}
