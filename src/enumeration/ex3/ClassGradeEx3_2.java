package enumeration.ex3;


public class ClassGradeEx3_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        // Grade grade = new Grade();  // enum은 외부에서 생성 불가
        // 오류 메시지 : enum classes may not be instantiated
       /* int result = discountService.discount(grade, price);
        System.out.println("newclassGrade 할인금액 " + result);
        */
    }
}
