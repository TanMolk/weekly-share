package java_7;

import java.util.ArrayList;
import java.util.List;

/**
 * @author molk tan
 * 2023/11/26
 */
public class DiamondOperatorExample {
    public static void main(String[] args) {
        // don't need to repeat the generics on the right side
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        System.out.println(list);
    }
}
