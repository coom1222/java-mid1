package lang.wrapper.test;

public class WrapperTest3 {

    public static void main(String[] args) {

       String str = "100";

       // String str을 Integer로 변환
       Integer intger1 = Integer.valueOf(str);
       System.out.println("intger1 = " + intger1);

        // Intger을 int로 변환
        int intValue = intger1.intValue();
        System.out.println("intValue = " + intValue);

        // int를 Integer로 변환
        Integer intger2 = Integer.valueOf(intValue);
        System.out.println("intger2 = " + intger2);
    }
}
/* parseInt() vs valueOf() 차이점
Integer.parseInt()는 결과값을 기본 자료형(Primitive Type)인 int 로 반환합니다.
Integer.valueOf()는 문자열의 값을 정수형으로 변환한 뒤 참조 자료형(Reference Type)인 Integer 객체로 만들어서 반환합니다.
 */
