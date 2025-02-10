package lang.string.test;

public class TestString5 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int extIndex = str.indexOf(ext);

        String filename = str.substring(0,extIndex);
        System.out.println("filename = " + filename);

        String extName = str.substring(extIndex);   // index값을 받는 경우, extIndex부터 끝까지를 리턴한다.
        System.out.println("extName = " + extName);
    }
}
