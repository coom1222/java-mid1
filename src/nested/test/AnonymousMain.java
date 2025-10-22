package nested.test;

public class AnonymousMain {

    public static void main(String[] args) {
        /* Hello의 익명 클래스 생성
         익명 클래스는 클래스의 본문(body)을 정의하면서 동시에 생성한다.
         new 다음에 바로 상속 받으면서 구현 할 부모 타입을 입력하면 된다.
         */
        Hello helloOut = new Hello() {

            @Override
            public void hello() {
                System.out.println("Hello.hello");
            }
        };

        helloOut.hello();

    }
}
