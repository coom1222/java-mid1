package exception.ex2;


import exception.ex1.NetworkClientV1;

public class NetworkServiceV2_1 {

    public void sendMassage(String data) throws NetworkClientExceptionV2 {// 이러면 메인에서 처리해야할것
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); // error 설정 추가

        client.connect();   // 예외가 발생할 수 있다. try-catch를 잡거나, 여기에서도 throws 로 던져야 한다.
        client.send(data);
        client.disconnect();
    }
}
