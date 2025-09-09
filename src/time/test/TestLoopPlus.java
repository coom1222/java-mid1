package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {

    public static void main(String[] args) {
        LocalDate dt = LocalDate.of(2024, 1, 1);

        // public LocalDate plus(long amountToAdd, TemporalUnit unit)
        for (int i = 0; i < 5; i++) {
            LocalDate nextDate = dt.plus(i*2, ChronoUnit.WEEKS);
            System.out.println("날짜 "+ (i+1) + ": " + nextDate);
        }
    }
}
