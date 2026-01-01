package exception.basic.unchecked;

public class ExceptionEx8 {

    public static void main(String[] args) {
       method1();
    }

    static void method1() {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("예외처리");
            e.printStackTrace();
        }
    }
}
