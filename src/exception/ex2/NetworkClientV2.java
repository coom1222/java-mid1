package exception.ex2;

public class NetworkClientV2 {

    private final String address;
    public boolean connectError;    // 기본값은 False
    public boolean sendError;

    public NetworkClientV2(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientExceptionV2 {
        if (connectError) {
            throw new NetworkClientExceptionV2("connectError", address + " 서버 연결 실패");
        }

        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws NetworkClientExceptionV2 {
        if (sendError){
           throw new NetworkClientExceptionV2("sendError", address + " 서버에 데이터 전송 실패: " + data);
           // 중간에 다른 예외가 발생했다고 가정하자
           //throw new RuntimeException("ex"); //-> disconnect가 호출이 되지 않고 프로그램이 죽는다.
        }
        // 전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
    }

    public void disconnect() {
        System.out.println(address + " 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")) {  // 문자열이 "error1" 을 가지고 있으면
            connectError = true;    // connectError 를 true 로 활성화
        }
        if (data.contains("error2")) {  // 문자열이 "error2" 을 가지고 있으면
            sendError = true;
        }
    }

}
