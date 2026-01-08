package exception.ex2;


public class NetworkServiceV2_2 {

    public void sendMassage(String data) {// 이러면 메인에서 처리해야할것
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); // error 설정 추가


        try {
            client.connect();   // 예외가 발생할 수 있다. try-catch를 잡거나, 여기에서도 throws 로 던져야 한다.
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
            return; // 연결 실패 시 메서드 종료. send가 호출되면 안된다.
        }

        try {
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
            return;
        }

        client.disconnect();
    }
}
