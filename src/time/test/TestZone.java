package time.test;

import java.time.*;

public class TestZone {

    public static void main(String[] args) {
        String zone = "Asia/Seoul";
        ZonedDateTime seoulTime = ZonedDateTime.of(LocalDate.of(2024,1,1), LocalTime.of(9,0), ZoneId.of("Asia/Seoul"));

        // ZoneDateTime으로 풀어본다면 with를 통해 변경이 가능하다.
        ZonedDateTime londonTime = seoulTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime newYorkTime = seoulTime.withZoneSameInstant(ZoneId.of("America/New_York"));


        System.out.println("서울의 회의 시간: " + seoulTime);
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
