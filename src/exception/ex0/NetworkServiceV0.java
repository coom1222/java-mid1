package exception.ex0;

public class NetworkServiceV0 {

    public void sendMassage(String data) {
        String address = "http://example.com";
        NetworkClientV0 client = new NetworkClientV0(address);

        client.connect();   // 연결하고
        client.send(data);  // 보내고
        client.disconnect();// disconnect
    }
}
