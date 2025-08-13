package lang.wrapper;

public class AutoboxingMain1 {

    public static void main(String[] args) {
        // Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);    // 기본형인 7을 넣어 Integer이라는 박스에 넣음

        // Wrapper -> Primitive
        int unboxedValue = boxedValue.intValue();   // intValue()를 통해 Integer 박스에서 값을 꺼냄

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
