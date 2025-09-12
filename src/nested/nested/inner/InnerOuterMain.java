package nested.nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner(); // Inner class를 생성하기 위해선 좀 특이하다
        inner.print();

        System.out.println(inner.getClass());
    }
}
