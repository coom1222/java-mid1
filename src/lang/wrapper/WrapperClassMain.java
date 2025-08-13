package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        // 기본형 타입을 객체로 감싸는 래퍼 클래스를 사용한다. 객체를 만들어 사용한다.
        Integer newIntger = new Integer(10);     // 미래에 삭제 예정, 대신에 valueOf()를 사용
        // Integer.valueOf()는 캐싱을 사용하여 -128 ~ 127 범위의 값을 재사용한다. 즉, 빠르다
        Integer integerObj = Integer.valueOf(10);   // -128 ~ 127 자주 사용하는 숫자 값 재사용, 불변
        Long longObj = Long.valueOf(10000000000L); // 래퍼 클래스는 불변이다. 즉, 값을 변경할 수 없다.
        Double doubleObj = Double.valueOf(10.5); // 래퍼 클래스는 불변이다.
        System.out.println("newIntger = " + newIntger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();   // intValue()를 통해 기본값을 꺼내 올 수 있다.
        System.out.println("intValue = " + intValue);   // 기본형인 10이 나온다.

        System.out.println("비교");
        System.out.println("==: " + (newIntger == integerObj)); // 다른 참조이므로 당연히 F
        System.out.println("equals: " + newIntger.equals(integerObj)); // equals로 비교해야 한다.

    }
}
/*
자바는 기본형에 대응하는 래퍼 클래스를 기본으로 제공한다
byte -> Byte
short -> Short
int -> Integer
long -> Long
float -> Float
double -> Double
char -> Character
boolean -> Boolean

이들은 불변이며, 비교는 equals() 메서드사용하자. == 을 사용할경우 다른 참조를 사용할 가능성 있다.

new Integer는 쓰지 말고, Integer.valueOf()를 사용하자.
 */