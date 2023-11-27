package java_15;

/**
 * @author molk tan
 * 2023/11/27
 */
public class SealedClassExample {

    private static sealed class Shape permits Circle, Triangle {

    }

    private static final class Circle extends Shape {

    }

    private static final class Triangle extends Shape {

    }
}
