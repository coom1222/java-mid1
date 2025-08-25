package enumeration.ex3;

import java.util.ArrayList;
import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {

        // 모든 ENUM 반환
        Grade[] values = Grade.values();
        System.out.println("values = " + values);
        System.out.println("values = " + Arrays.toString(values));
        // Arrays.toString() : 배열의 참조값이 아니라 배열 내부의 값을 문자열로 출력!

        for (Grade value : values) {
            System.out.println("name = " + value.name() + ", ordinal = " + value.ordinal());
        }

        // String -> ENUM 변환
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold);   // toString() 오버라이드 되어 있음
    }
}

