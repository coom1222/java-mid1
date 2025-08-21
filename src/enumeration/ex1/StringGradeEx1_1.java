package enumeration.ex1;


public class StringGradeEx1_1 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        int basic = discountService.discount(StringGrade.BASIC, price);
        int gold = discountService.discount(StringGrade.GOLD, price);
        int diamond = discountService.discount(StringGrade.DIAMOND, price);

        System.out.println("basic 할인금액 " + basic);
        System.out.println("gold 할인금액 " + gold);
        System.out.println("diamond 할인금액 " + diamond);
    }
}
/*
하지만 문자열 상수를 사용해도, 지금까지의 문제들을 근본적으로 해결할 수는 없다.
String타입은 어떤 문자열이든 입력할 수 있기 때문이다. 어떤 개발자가 실수로 StringGrade에 있는 문자열 상수 대신,
다른 문자열을 직접 사용해도 막을 수 있는 방법이 없다.
 */