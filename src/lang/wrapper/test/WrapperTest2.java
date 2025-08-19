package lang.wrapper.test;

public class WrapperTest2 {

    public static void main(String[] args) {

        String[] array = {"1.5", "2.5", "3.0"};

        double sum = 0;
        for (String string : array) {
            sum += Double.parseDouble(string); // 문자열을 정수로 변환하여 합산
        }

        System.out.println("sum = " + sum);
    }
}
