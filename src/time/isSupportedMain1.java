package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class isSupportedMain1 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();    // 년/월/일 만 있고 시/분/초는 없다.
        int minute = now.get(ChronoField.SECOND_OF_MINUTE);
        System.out.println("minute = " + minute);   // UnsupportedTemporalTypeException

        /*
        이런 문제를 예방하기 위해 TemporalAccessor와 Temporal 인터페이스는 현재 타입에서 특정 시간 단위나
        필드를 사용할 수 있는지 확인할 수 있는 메서드를 제공한다. 
         */
    }
}
