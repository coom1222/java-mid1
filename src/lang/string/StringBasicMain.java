package lang.string;

public class StringBasicMain {

    public static void main(String[] args) {
        String str1 = "hello";  // String은 클래스이다. int, boolean 같은 기본형이 아니라 참조형이다. 따라서 어색한 코드이다.
        String str2 = new String("hello");  // 문자도 객체를 생성할 수 있다.

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}

/*
String 클래스를 통해 문자열을 생성하는 방법은 2가지가 있다.
1. 쌍따옴표를 사용하거나 -> "hello"
2. 객체를 생성하거나 -> new String("hello")
 */
