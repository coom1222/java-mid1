package exception.ex1;


public class NetworkServiceV1_1 {

    public void sendMassage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data); // error 설정 추가

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
