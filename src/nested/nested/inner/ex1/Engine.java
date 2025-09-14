package nested.nested.inner.ex1;

// Car에서만 사용 -> 클래스 안에 넣어도 되지 않을까?
public class Engine {

    private Car car;

    public Engine(Car car) {
        this.car = car;
    }

    public void start() {
        System.out.println("충전 레벨 확인: " + car.getChargeLevel());
        System.out.println(car.getModel() + "의 엔진을 구동합니다.");
    }
}
