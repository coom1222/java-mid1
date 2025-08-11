package lang.wrapper;

public class MyIntgerNullMain1 {

    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1)};
        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100)); // 뭐가나올까? 루프에서 못찾으므로 -1을 반환
        System.out.println(findValue(intArr, -999)); // 이래도 -1이 나온다.
        // "값을 못찾았어" 라는 상태가 있어댜 한다.

    }

    private static MyInteger findValue(MyInteger[] intArr, int target) {
        for (MyInteger myInteger : intArr) {
            if (myInteger.getValue() == target) {
                return myInteger;
            }
        }
        return null;
    }
}
