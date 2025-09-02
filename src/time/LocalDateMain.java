package time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        System.out.println("오늘 날짜 = " + nowDate);

        LocalDate ofDate = LocalDate.of(2013, 11, 21);
        System.out.println("지정 날짜 = " + ofDate);

        // 계산(불변)
        ofDate = ofDate.plusDays(10);
        System.out.println("지정날짜 +10d = " + ofDate);
    // 모든 날짜 클래스는 불변이다. 따라서 변경이 발생하는 경우 새로운 객체를 생성해서 반환하므로 반환값을 꼭 받아야 한다.
    }
}
/*
기본 날짜와 시간 - LocalDateTime
LocalDate : 날짜만 표현할 때 예) 2024-06-11
LocalTime : 시간만 표현할 때 예) 14:30:00 - 초는 밀리초와 나노초 단위도 포함
LocalDateTime : 날짜와 시간을 모두 표현할 때 예) 2024-06-11T14:30:00

앞에 "Local"이 붙는 이유는 세계 시간대를 고려하지 않고 시스템의 기본 시간대(로컬 타임존)를 사용하기 때문이다.
 */
