package exception.ex4;


import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {

    public static void main(String[] args) {
        NetworkServiceV4 networkService = new NetworkServiceV4();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if(input.equals("exit")) {
                break;
            }

            try{
                networkService.sendMassage(input);
            } catch (Exception e){
                exceptionHandler(e);
            }


            System.out.println();
        }
        System.out.println("프로그램 종료");
    }

    // 공통 예외 처리
    private static void exceptionHandler(Exception e) {
        // 공통 처리
        System.out.println("사용자 메시지: 죄송합니다. 알 수 없는 문제가 발생했습니다.");
        System.out.println("==개발자용 디버깅 메시지==");
        e.printStackTrace(System.out);  // stackTrace 출력
        // e.printStackTrace(); -> 기본으로 () 안에 System.err로 간다. err로 가면 콘솔에 빨간색으로 출력해준다.
        // 이 경우, 콘솔에서 출력하는 스티림이 달라 섞이는 경우가 발생한다. 일반적으로는 e.printStackTrace()를 출력한다.

        // 예외 객체가 넘어온 경우 무엇을 할 수 있을까
        // 이렇게 필요하면 예외 별로 별도의 추가 처리 가능
        if (e instanceof SendExceptionV4 sendEx) {
            System.out.println("[전송 오류] 전송 데이터: " + sendEx.getSendData());
        }
        if (e instanceof ConnectExceptionV4 connectEx) {
            System.out.println("[연결 오류] 연결 주소: " + connectEx.getAddress());
        }
    }
}
