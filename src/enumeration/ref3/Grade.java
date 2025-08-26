package enumeration.ref3;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30), VIP(40);

    private final int discountPercent;

    // ebum 생성자는 묵시적으로 private이다
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    // 캡슐화 원칙을 적용하여 grade 안에서 계산을 해보자
    public int discount(int price) {
        return price * discountPercent / 100;
    }

}
