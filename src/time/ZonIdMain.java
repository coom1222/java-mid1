package time;

import java.time.ZoneId;
import java.util.Set;

public class ZonIdMain {

    public static void main(String[] args) {
        // 이용 가능한 ZoneId가 모두 출력된다.
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println("availableZoneId = " + availableZoneId);
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + " " + zoneId.getRules());
        }

        // 시스템이 사용하는 기본 ZoneId 반환
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("zoneId = " + zoneId);

        // 타임존을 직접 제공하여 ZoneId 객체 반환
        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
        System.out.println("seoulZoneId = " + seoulZoneId);
    }
}
