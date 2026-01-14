package exception.ex4;


public class NetworkServiceV5 {

    public void sendMassage(String data) {// 이러면 메인에서 처리해야할것
        String address = "http://example.com";

        // try-with-resources : 이름 그대로 `try` 에서 자원을 함께 사용한다는 뜻이다.
        try (NetworkClientV5 client = new NetworkClientV5(address)) {
            client.initError(data);
            client.connect();
            client.send(data);
        } catch (Exception e){
            System.out.println("[예외 확인]: " + e.getMessage());
            throw e;
        }
    }
}

