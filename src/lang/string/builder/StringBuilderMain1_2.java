package lang.string.builder;

public class StringBuilderMain1_2 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); // StringBuilder는 가변 문자열이다
        String string = sb.append("A").append("B").append("C").append("D")
                .insert(4, "Java")
                .delete(4, 8)
                .reverse()
                .toString();
        System.out.println("string = " + string);   // 이러면 마지막에 불변인 객체가 된다.
    }
}
