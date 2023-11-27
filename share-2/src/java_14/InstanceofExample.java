package java_14;

/**
 * @author molk tan
 * 2023/11/27
 */
public class InstanceofExample {
    public static void main(String[] args) {
        Object obj = "123";

        if (obj instanceof String s) {
            // can use s directly
            System.out.println(s);
        }
    }
}
