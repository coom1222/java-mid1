package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {

    public static void main(String[] args) {
        // 포맷팅 : 날짜와 시간 데이터를 원하는 포맷의 문자열로 변경하는 것 Date -> String
        LocalDateTime now = LocalDateTime.of(2024, 12, 31, 13, 30, 59);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("날짜와 시간 포맷팅: " + formattedDateTime);

        // 파싱 : 문자열을 날짜와 시간 데이터로 변경하는 것. St
        String dateTimeString = "2030-01-01 15:30:00";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println("문자열 파싱 날짜와 시간 = " + parsedDateTime);

    }

}

