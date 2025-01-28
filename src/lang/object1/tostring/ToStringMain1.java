package lang.object1.tostring;

public class ToStringMain1 {

    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        //toString() 메서드는 객체의 정보를 제공한다.
        //toString() 반환값 출력
        System.out.println(string);

        //object 직접 출력
        System.out.println(object);
    }
}
/*
System.out.println()은 객체를 출력할 때 toString() 메서드를 호출한다.
즉, 메서드 내부에서 toString()을 호출한다.
 */