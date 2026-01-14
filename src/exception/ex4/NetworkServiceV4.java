package exception.ex4;


import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.NetworkClientExceptionV4;

public class NetworkServiceV4 {

    public void sendMassage(String data) {// 이러면 메인에서 처리해야할것
        String address = "http://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data);

        try {   // 예외가 발생했을 때 catch를 순서대로 실행하므로, 더 디테일한 자식을 먼저 잡아야 한다.
            client.connect();
            client.send(data);
        } finally {
            client.disconnect();
        }
    }
}

/**
 * 언체크 예외이므로 throws를 사용하지 않는다.
 * -> 해당 오류들을 잡아도 복구할 수 없다.
 * 이겋게 해결할 수 없는 예외들은 다른 곳에서 공통으로 처리된다.
 */
