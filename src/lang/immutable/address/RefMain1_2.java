package lang.immutable.address;

public class RefMain1_2 {

    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");  // x001
        Address b = new Address("서울");  // x002

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");   // b의 값을 부산으로 변경해야함
        System.out.println("부산 ->  b");
        System.out.println("a = " + a);     // 사이드 이펙트 발생
        System.out.println("b = " + b);
    }
}

/*
사이드 이펙트 : 프로그램의 특정 부분에서 발생한 변경이 의도치 않게 다른 부분에 영향을 미치는 경우에 발생
 */