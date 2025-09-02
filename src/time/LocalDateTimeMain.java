package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2016, 8, 16, 8, 10, 1);

        System.out.println("현재 날짜 시간 = " + nowDt);
        System.out.println("지정 날짜 시간 = " + ofDt);

        // 날짜와 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);

        //날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        //계산(불변)
        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println("ofDtPlus = " + ofDtPlus);
        LocalDateTime ofDtPlus1Year = ofDt.plusYears(1);
        System.out.println("ofDtPlus1Year = " + ofDtPlus1Year);

        //비교
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이전인가? " + nowDt.isBefore(ofDt));
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이전인가? " + nowDt.isAfter(ofDt));
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이전인가? " + nowDt.isEqual(ofDt));
        /*
        isEqual() Vs equals()
        isEqual() 메서드는 비교 대상이 시간적으로 같으면 true를 반환한다.
        객체가 다르고 타임존이 달라도 시간적으로 같으면 true를 반환한다.
        예를 들어, 서울의 9시와 UTC의 0시는 시간적으로 같다. 이 둘을 비교하면 true를 반환한다.
        equals() 메서드는 객체의 타임존, 타임 등 모든 구성요소가 같아야 true를 반환한다.
        인스턴스는 달라도 된다.
         */
    }
}
