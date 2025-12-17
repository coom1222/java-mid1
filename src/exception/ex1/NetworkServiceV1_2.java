package exception.ex1;


public class NetworkServiceV1_2 {

    public void sendMassage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data); // error 설정 추가


        String connectResult = client.connect();
        // 결과가 성공이 아니다 -> 오류다.
        // !connectResult.equals("success") -> isError(connectResult)
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
            return;
        }

        String sendResult = client.send(data);
        if (isError(sendResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            return;
        }


        client.disconnect();    // "연결을 호출하면 무조건 disconnect 를 실행해야 한다"가 이 라이브러리의 요구조건
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
