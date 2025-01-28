package lang.object1.poly;

public class ObjectPolyExample1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
//        void action(Object obj = dog(Dog))    // Object는 자식인 Dog 타입을 참조할 수 있다.
        action(car);
    }

    // Object는 최상위 클래스이므로 모든 객체를 받을 수 있다.
    private static void action(Object obj) {

        // obj.sound(); // 컴파일 에러, Object 클래스에는 sound() 메서드가 없다.
        // obj.move(); // 컴파일 에러, Object 클래스에는 move() 메서드가 없다.
        // obj는 최상위 클래스이므로 다운캐스팅
        // 객체에 맞는 다운캐스팅이 필요하다
        if(obj instanceof Dog dog) {    // dog에 맞는 타입으로 다운캐스팅
            dog.sound();
        } else if(obj instanceof Car car) {
            car.move();
        }
    }
}
/*
instanceof는 객체 타입을 확인하는 연산자
형변환 가능 여부를 확인하며 T/F로 결과 반환
주로 상속관계에서 부모객체인지 자식객체인지 확인하는데 사용
객체 instanceof 클래스 형태로 선언한다
 */
