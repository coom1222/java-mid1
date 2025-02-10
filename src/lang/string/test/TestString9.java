package lang.string.test;

public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";
        // split("@")는 문자열을 @ 기준으로 나누어 배열을 생성
        String id = email.split("@")[0];         // @ 앞부분
        String domain = email.split("@")[1];     // @ 뒷부분

        System.out.println("id = " + id);
        System.out.println("domain = " + domain);
    }

}