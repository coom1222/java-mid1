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

        printCalendar(year, month);

        //
    }

    public static void printCalendar(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);

        // 일요일이 0, 월요일이 1, ..., 토요일이 6인 값을 반환
        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;

        System.out.println("일\t월\t화\t수\t목\t금\t토");

        for (int i = 0; i< offsetWeekDays; i++) {
            System.out.print("\t"); // offsetWeekDays 만큼 빈칸 출력
        }

        LocalDate dayIterator = firstDayOfMonth;

        while (dayIterator.isBefore(firstDayOfNextMonth)) { // 다음달의 첫날 전날까지
            System.out.print(dayIterator.getDayOfMonth() + "\t");

            // getDayOfWeek() : 주어진 날짜가 무슨 요일인지
            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println(); // 토요일이면 줄바꿈
            }

            dayIterator = dayIterator.plusDays(1); // 다음날로 이동


        }
    }
}
