package java_8;

import java.util.Arrays;
import java.util.List;

/**
 * @author molk tan
 * 2023/11/26
 */
public class LambdaExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        list.forEach(element -> System.out.println(element));
    }
}
