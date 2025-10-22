package nested.local;

public class LocalOuterV1 {

    private int outInstanceVar = 3;

    public void process(int pramVar) {
        int localVar = 1;

        class LocalPrinter {
            int value = 0;

            public void printData() {
                System.out.println("value = " + value); // 자기자신의 멤버변수에 접근
                System.out.println("localVar = " + localVar); // 지역변수에 접근이 가능한지
                System.out.println("pramVar = " + pramVar); // 매개변수에 접근이 가능한지(매개변수도 지역변수의 종류다)
                System.out.println("outInstanceVar = " + outInstanceVar); // 지역클래스도 내부 클래스이므로 바깥 클래스의 인스턴스에 소속된다.
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuterV1 = new LocalOuterV1();
        localOuterV1.process(2);
    }
}
