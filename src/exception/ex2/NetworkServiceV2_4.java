package exception.ex2;


public class NetworkServiceV2_4 {

    public void sendMassage(String data) {// 이러면 메인에서 처리해야할것
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {   // 하나의 try안에 정상 흐름을 모두 담는다.
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {  // 예외 흐름은 캐치 블럭에서 해결한다.
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        }
        client.disconnect();
    }
}
/**
 * 이러면 예외 처리가 끝난 다음에 정상 흐름의 마지막에 client.disconnect()를 호출했으므로,
 * 예외가 모두 처리되었기 때문에 client.disconnect()가 항상 호출될 것 같다. -> 실제로 그렇다
 * 하지만 catch에서 잡지 못하는 오류가 생긴다 해도 client.disconnect()가 호출된다.
 */
