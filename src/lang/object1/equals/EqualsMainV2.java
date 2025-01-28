package lang.object1.equals;

public class EqualsMainV2 {

    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");


        System.out.println("identity = " + (user1 == user2));       // 동일성 | 객체의 참조가 다르므로 동일성은 다르다.
        System.out.println("equality = " + user1.equals(user2));    // 동등성 | user1, user2는 서로 다른 객체지만 둘다 같은 고객번호(id)를 가지고 있따
        // 사람이 논리적으로 볼 때 이 두개는 같다
    }
}
