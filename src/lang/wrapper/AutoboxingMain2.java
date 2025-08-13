package lang.wrapper;

public class AutoboxingMain2 {

    public static void main(String[] args) {
        // Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value;    // 오토 박싱(Auto-boxing) | 자바에서 이젠 지원해준다.

        // Wrapper -> Primitive
        int unboxedValue = boxedValue;   // 오토 언박싱(Auto-unboxing)

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}

/*
컴파일러가 개발자 대신 vauleOf, xxxValue()등의 코드를 추가해주는 기능이다.
 */