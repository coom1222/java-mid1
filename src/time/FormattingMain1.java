package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {

    public static void main(String[] args) {
        // 포맷팅 : 날짜와 시간 데이터를 원하는 포맷의 문자열로 변경하는 것 Date -> String
        LocalDate date = LocalDate.of(2024, 12, 31);
        System.out.println("date = " + date);
        // System.out.println(date.getYear() + "년 " + date.getMonthValue() + "월 " + date.getDayOfMonth() + "일");    // 이렇게 해도 된다
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"); // 날짜를 내가 원하는 형태로 포맷팅
        String formattedDate = date.format(formatter);  // date 객체를 formatter 형태로 포맷팅해서 문자열로 반환
        System.out.println("날짜와 시간 포맷팅 = " + formattedDate);

        // 파싱 : 문자열을 날짜와 시간 데이터로 변경하는 것. String -> Date
        String input = "2030년 01월 01일";
        LocalDate parsedDate = LocalDate.parse(input, formatter);
        System.out.println("문자열 파싱 날짜와 시간 = " + parsedDate);
    }

}

