package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();

        System.out.print("월 입력하세요: ");
        int month = scanner.nextInt();

        // year, month를 받는 메소드를 만들어 보자.
        printCalendar(year, month);

    }

    public static void printCalendar(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);        // 달력의 시작
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);  // 달력의 끝

        // 일요일=0, 월요일=1, ..., 일요일=7인 값을 반환
        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;

        System.out.println("일\t월\t화\t수\t목\t금\t토");

        for (int i = 0; i< offsetWeekDays; i++) {
            System.out.print("\t"); // offsetWeekDays 만큼 빈칸 출력
        }

        // 1일부터 다음달 첫날의 전날까지(이번달 말까지) 반복문을 돌리자
        LocalDate dayIterator = firstDayOfMonth;
        while (dayIterator.isBefore(firstDayOfNextMonth)) {
            System.out.print(dayIterator.getDayOfMonth() + "\t");
            // System.out.printf("%2d", dayIterator.getDayOfMonth()); %2d는 2자리 공간 확보, 오른쪽 정렬

            // getDayOfWeek() : 주어진 날짜가 무슨 요일인지 확인하는 메서드
            // 이넘타입이므로 ==으로 비교 가능, 토요일마다 엔터 추가
            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }

            dayIterator = dayIterator.plusDays(1); // 다음날로 이동


        }
    }
}
