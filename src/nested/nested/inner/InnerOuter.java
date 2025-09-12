package nested.nested.inner;

public class InnerOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    // 내부 클래스
    class Inner {
        private int innerIstanceValue = 1;

        public void print() {
            // 자기 자신에 접근
            System.out.println(innerIstanceValue);

            // 외부 클래스의 인스턴스 멤버에 접근 가능, private 도접근 가능
            // 나한테는 outInstanceValue 가 없지만, 내부 인스턴스는 바깥 인스턴스의 참조를 보관한다.
            // 이 참조를 토앻 바깥 인스턴스의 멤버에 접근할 수 있다.
            System.out.println(outInstanceValue);

            // 외부 클래스의 클래스 멤버에 접근 가능, private 도접근 가능
            System.out.println(InnerOuter.outClassValue);
        }

    }
}
