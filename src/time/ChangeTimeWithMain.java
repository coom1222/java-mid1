package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("dt = " + dt);

        // with() 메서드 : 불변 객체일 때 with()를 사용하여 새로운 것을 만든다.
        LocalDateTime chagedDt1 = dt.with(ChronoField.YEAR, 2020);
        System.out.println("chagedDt1 = " + chagedDt1);     // 기존의 것에다 살짝 바꾸어 새로운 객체로 만들어 반환하기

        LocalDateTime chagedDt2 = dt.withYear(2021);    // with를 사용한 편의 메서드가 있다.
        System.out.println("chagedDt2 = " + chagedDt2);

        // TemporalAdjuster 사용
        // 다음 주 금요일
        LocalDateTime with1 = dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("기준 날짜: " + dt);
        System.out.println("다음 주 금요일: " + with1);

        // 이번 달의 마지막 일요일
        LocalDateTime with2 = dt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
        System.out.println("같은 달의 마지막 일요일 = " + with2);
    }
}
