package nested.nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {

    private int outInstanceVar = 3;

    public Printer process(int pramVar) {

        int localVar = 1;   // 지역 변수, 스택 프레임이 종료되는 순간 함께 제거된다.

        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value); // 자기자신의 멤버변수에 접근

                // 인스턴스는 지역 변수보다 더 오래 살아남는다.
                System.out.println("localVar = " + localVar); // 지역변수에 접근이 가능한지
                System.out.println("pramVar = " + pramVar); // 매개변수에 접근이 가능한지(매개변수도 지역변수의 종류다)
                System.out.println("outInstanceVar = " + outInstanceVar); // 지역클래스도 내부 클래스이므로 바깥 클래스의 인스턴스에 소속된다.
            }
        }

        LocalPrinter printer = new LocalPrinter();
        // printer.print(); 여기서 실행하지 않고 Printer 인스턴스만 반환
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuterV1 = new LocalOuterV3();
        Printer printer = localOuterV1.process(2);
        // printer.print()를 나중에 실행한다. process()의 스택 프레임이 사라진 이후에 실행한다.
        printer.print();

        // 추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
    }
}
