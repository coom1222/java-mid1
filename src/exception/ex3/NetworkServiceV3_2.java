package exception.ex3;


import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;

public class NetworkServiceV3_2 {

    public void sendMassage(String data) {// 이러면 메인에서 처리해야할것
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try {   // 예외가 발생했을 때 catch를 순서대로 실행하므로, 더 디테일한 자식을 먼저 잡아야 한다.
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소 : " + e.getAddress() + ", 메시지: " + e.getMessage() );
        } catch (NetworkClientExceptionV3 e) {
            System.out.println("[네트워크 오류] 메시지 : " + "메시지: " + e.getMessage() );
        } catch (Exception e) {
            System.out.println("[알 수 없는 오류] 메시지: " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}

/**
 * 예외 클래스를 각각의 상황에 맞춰 만들면(send, connect), 각 필요에 맞는 예외를 잡아서 처리할 수 있다.
 * e.getAddress(), e.getSendData()와 같이 각각의 예외 클래스가 가지는 고유의 기능을 활용할 수 있다.
 */
