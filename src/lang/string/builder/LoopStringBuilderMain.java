package lang.string.builder;

public class LoopStringBuilderMain {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("Hello Java ");
        }

        long endTime = System.currentTimeMillis();

        String result = sb.toString();
        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime) + "ms");
    }
}

/*
StringBuilder와 StringBuffer
StringBuffer는 멀티 쓰레드 환경에서 안전하지만, 동기화 오버헤드로 인해 성능이 느리다.
StringBuilder는 멀티 쓰레드 환경에서 안전하지 않지만, 동기화 오버헤드가 없으므로 속도가 빠르다.
 */