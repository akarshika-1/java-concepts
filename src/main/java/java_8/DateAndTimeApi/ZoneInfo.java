package java_8.DateAndTimeApi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneInfo {
    public static void main(String[] args) {
        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone);

        ZoneId la = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(la);
        System.out.println(zonedDateTime);
    }
}
