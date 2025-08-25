package enumeration.ex0;

public class DiscountService {

    public int discount(String grade, int price) {
        int discountPercentage = 0;

        if (grade.equals("BASIC")) {
            discountPercentage = 10;
        } else if (grade.equals("GOLD")) {
            discountPercentage = 20;
        } else if (grade.equals("DIAMOND")) {
            discountPercentage = 30;
        } else {
            System.out.println(grade + ": 할인X");
        }

        // 10000 * (20/100) = 2000
        return price * discountPercentage / 100;
    }
}
