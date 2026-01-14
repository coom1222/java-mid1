package exception.ex4.exception;


/**
 * 연결 실패시 발생하는 예외. 내부에 연결을 시도한 address를 보관한다.
 * NetworkClientExceptionV3를 상속했다.
 */
public class ConnectExceptionV4 extends NetworkClientExceptionV4 {

    private final String address;

    public ConnectExceptionV4(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
