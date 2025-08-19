package lang.wrapper.test;

public class WrapperTest4 {

    public static void main(String[] args) {

       String str = "100";

       // String str을 Integer로 변환
       Integer intger1 = Integer.valueOf(str);
       System.out.println("intger1 = " + intger1);

        // Intger을 int로 변환
        int intValue = intger1; // aouto-unboxing
        System.out.println("intValue = " + intValue);

        // int를 Integer로 변환
        Integer intger2 = intValue; // auto-boxing
        System.out.println("intger2 = " + intger2);
    }
}
/*
Wrapper 클래스는 기본 타입을 객체로 다룰 수 있게 해주는 클래스이다.
Wrapper 타입간의 변환은 auto-boxing과 auto-unboxing을 지원해준다.
 */
