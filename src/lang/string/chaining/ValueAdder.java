package lang.string.chaining;

public class ValueAdder {

    private int value;

    public ValueAdder add(int addValue) {
        value += addValue;  // 본인의 값을 증가시키는 것을 제공
        return this;  // 나 자신을 반환
    }

    public int getValue() {
        return value;
    }
}
