package time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

// TemporalUnit 인터페이스는 날짜와 시간을 측정하는 단위를 나타낸다.
// import java.time.temporal.ChronoUnit 열거형으로 구현되어 있다.
// ChronoUnit은 다양한 시간 단위를 제공한다. (Unit은 단위이다)
public class ChronoUnitMain {

    public static void main(String[] args) {
        // ChronoUnit을 사용하면 두 날짜 또는 시간 사이의 차이를 해당 단위로 쉽게 계산할 수 있다.
        ChronoUnit[] values = ChronoUnit.values();  // enum(열거형)으로 정의되어있다.
        for (ChronoUnit value : values) {
            System.out.println("value = " + value);
        }
        System.out.println("ChronoUnit.HOURS = " + ChronoUnit.HOURS);
        System.out.println("HOURS.Duration() = " + ChronoUnit.HOURS.getDuration().getSeconds());
        System.out.println("DAYS = " + ChronoUnit.DAYS);
        System.out.println("DAYS.Duration = " + ChronoUnit.DAYS.getDuration().getSeconds());

        LocalTime lt1 = LocalTime.of(1, 10, 0);
        LocalTime lt2 = LocalTime.of(1, 20, 0);

        long secondsBetween = ChronoUnit.SECONDS.between(lt1, lt2);
        System.out.println("secondsBetween = " + secondsBetween);

        long minutesBetween = ChronoUnit.MINUTES.between(lt1, lt2);
        System.out.println("minutesBetween = " + minutesBetween);
    }
}
