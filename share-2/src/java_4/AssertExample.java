package java_4;

/**
 * @author molk tan
 * 2023/11/26
 */
public class AssertExample {
    public static void main(String[] args) {
        int value = -5;
        assert value >= 0 : "Value is negative";
        System.out.println("Value is " + value);
    }
}
