package lang.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {

        int num = 100;
        boolean bool = true;
        String str = "Hello, Java!";

        // format 메서드
        String format1 = String.format("num: %d, bool: %b, str: %s", num, bool, str);
        System.out.println(format1);

        String format2 = String.format("숫자: %.2f", 10.1234);
        System.out.println(format2);

        //printf
        System.out.printf("숫자: %.2f\n", 10.1234);

        // matches 메서드
        String regex = "Hello, (Java!|World!)";
        System.out.println("'str' 이 패턴과 일치하는가? " + str.matches(regex));
    }
}
/*
valueOf(Object obj) : 다양한 타입을 문자열로 변환한다
toCharArray(): 문자열을 문자 배열로 변환한다
format(String format, Object... args) : 형식 문자열과 인자를 사용하여 새로운 문자열을 생성한다
matches(String regex) : 문자열이 주어진 정규 표현식과 일치하는지 확인한다
 */