package java_9;

import java.util.stream.Stream;

/**
 * @author molk tan
 * 2023/11/26
 */
public class StreamApiEnhancements {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5, 6)
                .takeWhile(n -> n < 4)
                .forEach(System.out::println); // output 1, 2, 3
    }
}
