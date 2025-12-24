package exception.basic.checked;

public class CheckedThrowMain {

    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.catchThrow();   // 여기서 예외를 메인 밖으로 던졌기에 정상종료를 출력하지 못하고 끝난다.
        System.out.println("정상종료");
    }
}
