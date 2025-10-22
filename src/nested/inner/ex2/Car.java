package nested.inner.ex2;


public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();     // 엔진을 넘길 때 자동차의 정보를 넘겨야 하므로 나 자신을 넘긴다.
    }

  /*  // Engine에서만 사용하는 메서드 -> 너네는 리팩토링 당해야겠지. 없어도 되겠다.
    public String getModel() {
        return model;
    }

    // Engine에서만 사용하는 메서드
    public int getChargeLevel() {
        return chargeLevel;
    }
*/
    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }

    // 내부클래스, 바깥 클래스의 인스턴스에 접근 가능하므로 Car 정보 없어도 접근 가능하다.
    private class Engine {
        public void start() {
            System.out.println("충전 레벨 확인: " + chargeLevel);
            System.out.println(model + "의 엔진을 구동합니다.");
        }
    }
}
