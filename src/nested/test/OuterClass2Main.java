package nested.test;

public class OuterClass2Main {

    public static void main(String[] args) {
        OuterClass2 outerClass2 = new OuterClass2();
        OuterClass2.InnerClass innerClass = outerClass2.new InnerClass();
        innerClass.hello();
    }
}

/*
내부 클래스는 바깥 클래스의 인스턴스에 소속된다. 따라서 바깥 클래스의 인스턴스 정보를 알아야 생성할 수 있다.
내부 클래스는 바깥클래스의 인스턴스 참조. new 내부클래스()로 생성할 수 있다.
 */
