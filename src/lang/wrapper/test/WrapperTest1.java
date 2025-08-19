package lang.wrapper.test;

import static java.lang.Integer.parseInt;

public class WrapperTest1 {

    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        // 스태틱 import를 사용하는 경우
        // int result = parseInt(str1) + parseInt(str2);

        int result = Integer.parseInt(str1) + Integer.parseInt(str2);

        System.out.println("result = " + result);
    }
}
