package lang.wrapper;

public class MyInteger {

    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int target) {
        if (value < target){
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(value);   // .valueOf()는 int를 String으로 변환하는 메서드
    }
}
// compareTo() 메서드를 클래스 내부로 캡슐화
// 이 클래스는 불변으로 설계
// 데이터조각에 불과한 Int를 MyInteger이라는 객체로 다룰 수 있게 되었다.