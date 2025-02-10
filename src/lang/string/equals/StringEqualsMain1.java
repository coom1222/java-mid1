package lang.string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        String str1 = new String("hello");  // x001
        String str2 = new String("hello");  // x002
        System.out.println("new String() == 비교: " + (str1 == str2));
        System.out.println("new String() equals 비교: " + str1.equals(str2));

        String str3 = "hello";  // x003
        String str4 = "hello";  // x004
        System.out.println("리터럴 == 비교: " + (str3 == str4));
        System.out.println("리터럴 equals 비교: " + str3.equals(str4));
    }
}

/*
프로그램에서 풀(Pool)은 공용 자원을 모아둔 곳을 뜻한다. 여러 곳에서 함께 사용할 수 있는 객체를 필요할 때마다 생성하고 제거하는 것은
비효율적이다. 대신에 이렇게 문자열 풀에 필요한 String 인스턴스를 미리 만들어두고 여러곳에서 재사용할 수 있다면 메모리를
효율적으로 관리할 수 있다.
 */