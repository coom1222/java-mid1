package lang.string.chaining;

public class MethodCahiningMain3 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        int result = adder.add(1).add(2).add(3).getValue(); // 체인처럼 엮여 있다 해서 메서드 체이닝 기법
        System.out.println("result = " + result);
    }
}
