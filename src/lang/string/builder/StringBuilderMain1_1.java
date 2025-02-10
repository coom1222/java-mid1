package lang.string.builder;

public class StringBuilderMain1_1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); // StringBuilder는 가변 문자열이다
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4, "Java");   // 4번째 다음에다가 Java를 넣어라
        System.out.println("insert = " + sb);

        sb.delete(4, 8); // 4번째부터 8번째 전까지 삭제
        System.out.println("delete = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb);

        //StringBuilder는 String과 달리 메서드를 호출하면 StringBuilder 객체 자신을 반환한다.
        String string = sb.toString();
        System.out.println("string = " + string);   // 이러면 마지막에 불변인 객체가 된다.
    }
}
