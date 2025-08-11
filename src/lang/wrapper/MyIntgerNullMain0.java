package lang.wrapper;

public class MyIntgerNullMain0 {

    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};
        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100)); // 뭐가나올까? 루프에서 못찾으므로 -1을 반환
        System.out.println(findValue(intArr, -999)); // 이래도 -1이 나온다.
        // "값을 못찾았어" 라는 상태가 있어댜 한다.

    }

    private static int findValue(int[] intArr, int target) {
        for (int value : intArr) {
            if (value == target) {
                return value;
            }
        }
        return -1;  // int기 때문에 뭐라도 반환을 하여야한다. 안할 수 없다.
    }
}
