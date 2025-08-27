package enumeration.test;

public class AuthGradeMain1 {

    public static void main(String[] args) {
/*

        System.out.println("grade = " + guest + ", level= " + guest.getLevel() + ", 설명= " + guest.getDescription());
        System.out.println("grade = " + login + ", level= " + login.getLevel() + ", 설명= " + login.getDescription());
        System.out.println("grade = " + admin + ", level= " + admin.getLevel() + ", 설명= " + admin.getDescription());

        AuthGrade guest = AuthGrade.GUEST;
        AuthGrade login = AuthGrade.LOGIN;
        AuthGrade admin = AuthGrade.ADMIN;
*/
        AuthGrade[] grades = AuthGrade.values();
        for (AuthGrade grade : grades) {
            System.out.println("grade = " + grade + ", level= " + grade.getLevel() + ", 설명= " + grade.getDescription());
        }
    }
}
