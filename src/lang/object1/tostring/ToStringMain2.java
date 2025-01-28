package lang.object1.tostring;

public class ToStringMain2 {

    public static void main(String[] args) {
        Car car = new Car("ModelY");
        Dog dog1 = new Dog("Puppy", 2);
        Dog dog2 = new Dog("Puppy2", 3);

        System.out.println("1. 단순 toString 출력");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println() 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        String refValue1 = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("refValue = " + refValue1);

        String refValue2 = Integer.toHexString(System.identityHashCode(dog2));
        System.out.println("refValue = " + refValue2);
    }
}
