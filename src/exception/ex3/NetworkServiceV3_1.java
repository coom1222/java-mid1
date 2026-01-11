package exception.ex3;


import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_1 {

    public void sendMassage(String data) {// 이러면 메인에서 처리해야할것
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try {   // 하나의 try안에 정상 흐름을 모두 담는다.
            client.connect();
            client.send(data);
        } catch (SendExceptionV3 e) {
            System.out.println("[연결 오류] 전송 데이터 : " + e.getSendData() + ", 메시지: " + e.getMessage() );
        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소 : " + e.getAddress() + ", 메시지: " + e.getMessage() );
        } finally {
            client.disconnect();
        }
    }
}

/**
 * 예외 클래스를 각각의 상황에 맞춰 만들면(send, connect), 각 필요에 맞는 예외를 잡아서 처리할 수 있다.
 * e.getAddress(), e.getSendData()와 같이 각각의 예외 클래스가 가지는 고유의 기능을 활용할 수 있다.
 */
