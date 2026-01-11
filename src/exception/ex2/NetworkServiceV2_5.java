package exception.ex2;


public class NetworkServiceV2_5 {

    public void sendMassage(String data) {// 이러면 메인에서 처리해야할것
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {   // 하나의 try안에 정상 흐름을 모두 담는다.
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {  // 예외 흐름은 캐치 블럭에서 해결한다.
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
/**
 * try ~ catch ~ finally 구조는 정상흐름, 예외흐름, 마무리 흐름(반드시 호출해야 하는)을 제공한다.
 * try를 시작하기만 하면, finally 코드 블럭은 어떤 경우라도 반드시 호출된다.
 * try, catch 안에서 잡을 수 없는 예외가 발생해도 finally는 반드시 호출된다.
 */


