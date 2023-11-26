package java_8;

/**
 * @author molk tan
 * 2023/11/26
 */

interface MyInterface {
    default void newMethod() {
        System.out.println("New default method");
    }
}

public class DefaultMethodExample implements MyInterface {
    public static void main(String[] args) {
        new DefaultMethodExample().newMethod();
    }
}
