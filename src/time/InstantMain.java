package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {

    public static void main(String[] args) {
        // 생성
        Instant now = Instant.now();    // UTC 기준
        System.out.println("now = " + now);

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        Instant epochStart = Instant.ofEpochSecond(0);  // 1970-01-01 0시 0분 0초에 0초를 더한 시간
        System.out.println("epochStart = " + epochStart);

        // 계산
        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);

        // 조회(1970년 1월 1일 0시 0분 0초부터 몇 초가 지났는지 반환)
        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterEpochSecond = " + laterEpochSecond);
    }
}

/*
장점 :
- 시간대 독립성 : UTC를 기준으로 하므로 시간대에 영향을 받지 않는다.
- 고정된 기준점 : 1970년 1월 1일 이후의 시간을 밀리초 단위로 표현하여, 시간 계산이 간편하다.

단점 :
- 사용자 친화적이지 않음 : 기계적인 시간 처리에는 적합하지만 사람이 읽고 이해하기엔 부적합하다.
- 시간대 정보 없음 : 특정 시간대의 시간을 표현하거나 변환하는 데는 적합하지 않다.

전 세계적인 시간 기준이 필요하거나 시간대 변환 없이 시간 계산이 필요할 때, 데이터를 저장 및 교환할 때 좋다.
 */