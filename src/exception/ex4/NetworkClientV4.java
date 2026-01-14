package exception.ex4;

import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.SendExceptionV4;

public class NetworkClientV4 {

    private final String address;
    public boolean connectError;    // 기본값은 False
    public boolean sendError;

    public NetworkClientV4(String address) {
        this.address = address;
    }

    public void connect(){
        if (connectError) {
            throw new ConnectExceptionV4(address, address + "서버 연결 실패");
        }

        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data){
        if (sendError){
           throw new SendExceptionV4(data, address + " 서버에 데이터 전송 실패: " + data);
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
