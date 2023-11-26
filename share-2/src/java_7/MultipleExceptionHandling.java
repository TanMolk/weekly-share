package java_7;

/**
 * @author molk tan
 * 2023/11/26
 */
public class MultipleExceptionHandling {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[1];
            numbers[1] = 10 / 0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
