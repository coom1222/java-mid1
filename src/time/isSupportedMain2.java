package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class isSupportedMain2 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();    // 년/월/일 만 있고 시/분/초는 없다.

        boolean supported = now.isSupported(ChronoField.SECOND_OF_MINUTE);
        System.out.println("supported = " + supported);
        if (supported) {
            int minute = now.get(ChronoField.SECOND_OF_MINUTE);
            System.out.println("minute = " + minute);
        }
    }
}
/*
isSupported() 메서드를 사용해서 특정 필드가 지원되는지 확인할 수 있다.
 */
