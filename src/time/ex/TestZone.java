package time.ex;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {

    public static void main(String[] args) {
        String zone = "Asia/Seoul";
        LocalDateTime now = LocalDateTime.of(2024,1,1,9,00,00);

        ZoneId LondonZoneId = ZoneId.of("Europe/London");
        ZoneId NewYorkZoneId = ZoneId.of("America/New_York");

        ZonedDateTime londonTime = now.atZone(LondonZoneId);
        ZonedDateTime newYorkTime = now.atZone(NewYorkZoneId);

        System.out.println("서울의 회의 시간: " + now + "[" + zone + "]");
        System.out.println("런던의 회의 시간: " + londonTime);
        System.out.println("뉴욕의 회의 시간: " + newYorkTime);
    }
}
/*
public ZonedDateTime atZone(ZoneId zone) {
    return ZonedDateTime.of(this, zone);
}
 "this(현재 LocalDateTime 객체)가 가진 날짜/시간 정보와 파라미터로 받은 zone의 시간대 정보를 합쳐서
 새로운 ZonedDateTime 객체를 만들어 반환하라"는 의미가 됩니다.
 */
