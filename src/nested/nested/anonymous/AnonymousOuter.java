package nested.nested.anonymous;

import nested.nested.local.Printer;

public class AnonymousOuter {

    private int outInstanceVar = 3;

    public void process(int pramVar) {
        int localVar = 1;

        Printer printer = new Printer() {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value); // 자기자신의 멤버변수에 접근
                System.out.println("localVar = " + localVar); // 지역변수에 접근이 가능한지
                System.out.println("pramVar = " + pramVar); // 매개변수에 접근이 가능한지(매개변수도 지역변수의 종류다)
                System.out.println("outInstanceVar = " + outInstanceVar); // 지역클래스도 내부 클래스이므로 바깥 클래스의 인스턴스에 소속된다.
            }
        };

        printer.print();
        System.out.println("printer.class = " + printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }
}
