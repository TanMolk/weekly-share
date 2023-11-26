package java_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author molk tan
 */

public class CollectionsExample {
    public static void main(String[] args) {
        // 创建一个集合
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C++");
        list.add("Python");

        // 遍历集合
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
