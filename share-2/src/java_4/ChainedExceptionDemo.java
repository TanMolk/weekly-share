package java_4;

/**
 * @author molk tan
 * 2023/11/26
 */
public class ChainedExceptionDemo {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void method1() throws Exception {
        try {
            throw new Exception("An error occurred in method1");
        } catch (Exception e) {
            throw new Exception("An error occurred in method1", e);
        }
    }
}

