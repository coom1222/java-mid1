package lang.object1.poly;

public class ObjectPolyExample2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object();   // Object도 인스턴스를 만들 수 있다.

        Object[] objects = {dog, car, object};
        /*Object[] objects = new Object[3];
        objects[0] = dog;
        objects[1] = car;
        objects[2] = object;
        */

        size(objects);

    }

    // 모든 객체를 저장할 수 있는 배열을 만들었다. 따라서 size()메서드는 자바를 사용하는 곳이라면 어디든지 사용될 수 있다.
    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수는: " + objects.length);
    }


}
