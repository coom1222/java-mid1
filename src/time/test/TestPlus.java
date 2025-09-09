package time.test;

import java.time.LocalDateTime;

public class TestPlus {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        System.out.println("기준 시각: " + dt);

        LocalDateTime PlusYear = dt.plusYears(1);
        LocalDateTime PlusMonth = PlusYear.plusMonths(2);
        LocalDateTime PlusDay = PlusMonth.plusDays(3);
        LocalDateTime PlusHour = PlusDay.plusHours(4);

        LocalDateTime futureDateTime = dt.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
        System.out.println("1년 2개월 3일 4시간 후의 시각 : " + PlusHour);
        System.out.println("1년 2개월 3일 4시간 후의 시각 : " + futureDateTime);
    }
}
