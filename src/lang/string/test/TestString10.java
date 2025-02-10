package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] result = fruits.split(",");

        for (String str : result) {
            System.out.println(str);
        }

        String joinedString = String.join("->", result);
        System.out.println("joinedString = " + joinedString);
    }
}