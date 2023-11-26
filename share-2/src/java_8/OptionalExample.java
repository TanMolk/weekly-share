package java_8;

import java.util.Optional;

/**
 * @author molk tan
 * 2023/11/26
 */
public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Java 8");
        optional.ifPresent(System.out::println);
    }
}
