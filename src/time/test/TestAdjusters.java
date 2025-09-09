package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

// 설명 꼭 듣기
public class TestAdjusters {

    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        LocalDate dt = LocalDate.of(year, month, 1);
        DayOfWeek lastDayOfWeek = dt.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();

        System.out.println("firstDayOfWeek: " + dt.getDayOfWeek()); // getDayOfWeek() : 주어진 날짜가 무슨 요일인지
        System.out.println("lastDayOfWeek: " + lastDayOfWeek);
    }
}

/*
TemporalAdjusters: 미리 준비된 '도구 상자' 🛠️
TemporalAdjusters(끝에 's'가 붙음)는 유틸리티 클래스(Utility Class)입니다.
이 클래스는 자주 사용되는 TemporalAdjuster의 구현체들을 정적 팩토리 메서드(static factory method) 형태로 미리 만들어서 제공합니다.
개발자는 이 클래스가 제공하는 메서드를 호출하기만 하면 간편하게 날짜를 조정할 수 있습니다.

역할: 일반적이고 유용한 시간 조정 기능들을 모아놓은 '도구 모음'입니다.
특징: final 클래스이며, 모든 메서드가 static으로 선언되어 있어 객체를 생성할 필요 없이 바로 사용할 수 있습니다. 코드가 간결해지고 가독성이 높아집니다.

주요 제공 기능:
- firstDayOfMonth(): 현재 달의 첫 번째 날
- lastDayOfMonth(): 현재 달의 마지막 날
- next(DayOfWeek dayOfWeek): 현재 날짜 이후의 가장 가까운 지정된 요일
- previousOrSame(DayOfWeek dayOfWeek): 현재 날짜를 포함하여 이전의 가장 가까운 지정된 요일
- firstDayOfNextYear(): 다음 해의 첫 번째 날
 */
