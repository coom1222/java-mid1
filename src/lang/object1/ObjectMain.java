package lang.object1;

public class ObjectMain {

    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString()은 Object 클래스의 메서드
        // 이 메서드는 객체의 정보를 제공한다.
        String string = child.toString();
        System.out.println(string);
    }
}
