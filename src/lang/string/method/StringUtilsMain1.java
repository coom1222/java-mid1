package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        // valuOf 메소드, valuOf(Object obj) : 다양한 타입을 문자열로 변환한다.
        String numString = String.valueOf(num);
        System.out.println("숫자의 문자열 값: " + numString);  // 문자 100이 들어감

        String boolString = String.valueOf(bool);
        System.out.println("불리언의 문자열 값: " + boolString);

        String objString = String.valueOf(obj);
        System.out.println("객체의 문자열 값: " + objString);

        // 다음과 같이 간단히 변환할 수 있음(문자 + ㅌ -> 문자x)
        String numString2 = " + num";
        System.out.println("빈 문자열 + num: " + numString2);

        // toCharArray 메서드
        char[] strCharArray = str.toCharArray();
        System.out.println("문자열을 문자 배열로 변환: " + strCharArray);

        for (int i = 0; i < strCharArray.length-1; i++) {
            System.out.print(strCharArray[i]+",");
        }


        System.out.println();
    }
}
