package lang.wrapper;

public class MyIntergerMethodMain0 {

    public static void main(String[] args) {
        int value = 10;
        int i1 = compareTo(value, 5);
        int i2 = compareTo(value, 10);
        int i3 = compareTo(value, 20);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
        // 이 메소드는 계속해서 value라는 값을 중복하여 사용해 비교한다.
        // 따지고 보면 되게 비효율적이지 않나?
        // 그래서 자바에서는 기본형 타입을 객체로 감싸는 래퍼 클래스를 제공한다.
    }

    public static int compareTo(int value, int target) {
        if (value < target){
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }
}
