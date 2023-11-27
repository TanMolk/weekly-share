package java_10;

import java.util.ArrayList;

/**
 * @author molk tan
 * 2023/11/27
 */
public class VarExample {
    public static void main(String[] args) {
        var list = new ArrayList<String>(); // 推断为ArrayList<String>
        var stream = list.stream(); // 推断为Stream<String>
    }
}
