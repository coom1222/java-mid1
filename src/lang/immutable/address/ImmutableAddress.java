package lang.immutable.address;

public class ImmutableAddress {

    private final String value;       // 내부값이 변경되면 안되므로 final 선언

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    // 값을 변경할 수 있는 setValue 제거

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
/*
이 클래스는 생성자를 통해서만 값을 설정할 수 있고, 이후에는 값을 변경하는 것이 불가능하다
 */