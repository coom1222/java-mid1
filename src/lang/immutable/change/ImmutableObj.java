package lang.immutable.change;

public class ImmutableObj {

    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public ImmutableObj add(int addValue) {
        int result = value + addValue;
        return new ImmutableObj(result);   // 30이 들어간 채로 객체 생성, 그대로 반환
    }

    // final 이므로 setter는 만들수 없다
}
