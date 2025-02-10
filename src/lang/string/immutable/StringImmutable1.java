package lang.string.immutable;

public class StringImmutable1 {

    public static void main(String[] args) {
        String str = "hello";
        String str2 = str.concat(" java"); // String.concat()메서드를 사용하면 기존 문자열에 새로운 문자열을 연결해서 합칠 수 있다.
        System.out.println("str = " + str); // 하지만 합쳐지지 않는다. String은 불변(immutable)이기 때문이다.
        System.out.println("str2 = " + str2); // 하지만 합쳐지지 않는다. String은 불변(immutable)이기 때문이다.
    }
}

/*
만약 String 내부의 값을 변경할 수 있다면, 기존에 문자열 풀에서 같은 문자를 참조하는 변수의 모든 문자가 함께 변경되는 문제가 발생한다.
String 내부의 값을 변경할 수 있다면, str3이 참조하는 문자를 변경하면 str4의 문자도 함께 변경되는 사이드 이펙트 문제가 발생한다.
 */

