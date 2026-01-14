package exception.ex4.exception;


/**
 * 전송 실패시 발생하는 예외. 내부에 전송을 시도한 데이터인 sendData를 보관한다.
 * NetworkClientExceptionV3를 상속했다.
 */
public class SendExceptionV4 extends RuntimeException {

    private final String sendData;

    public SendExceptionV4(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
