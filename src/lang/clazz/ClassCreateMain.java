package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        Class helloClass = Hello.class;
        // Class helloClass = Class.forName("lang.clazz.Hello");

        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();// Hello 클래스가 가진 생성자를 얻어 객체를 생성한다
        String result = hello.hello(); // 생성된 객체를 통해 메서드를 호출한다
        System.out.println("result = " + result);
    }
}
/*
getDeclaredConstructor() : 생성자를 선택한다.
newInstance() : 선택된 생성자를 기반으로 인스턴스를 생성한다.
 */