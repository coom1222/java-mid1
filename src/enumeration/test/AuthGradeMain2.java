package enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
        String grade = scanner.nextLine();


        // toUpperCase() : 문자열을 대문자로 변환 -> 대소문자 구분 없이 입력을 받을 수 있다.
        AuthGrade authGrade = AuthGrade.valueOf(grade.toUpperCase());
        System.out.println("당신의 등급은 " + authGrade.getDescription() + "입니다.");

        System.out.println("==메뉴 목록==");
        if (authGrade.getLevel() > 0) {
            System.out.println("-main");
        }
        if (authGrade.getLevel() > 1) {
            System.out.println("-eMail");
        }
        if (authGrade.getLevel() > 2) {
            System.out.println("-admin");
        }
    }
}
