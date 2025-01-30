package lang.immutable.test;

public class ImmutableMydateMain {

    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);    // x001 반환
        ImmutableMyDate date2 = date1;  // x001 반환

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("2025 -> date1");
        date1 = date1.withYear(2025);   // x002 반환
        // date1 = new ImmutableMyDate(2025, 1, 1);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}
