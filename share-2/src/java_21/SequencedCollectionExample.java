package java_21;

import java.util.ArrayList;
import java.util.SequencedCollection;

/**
 * @author molk tan
 * 2023/11/27
 */
public class SequencedCollectionExample {
    public static void main(String[] args) {
        SequencedCollection<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        System.out.println(list.reversed());
        System.out.println(list.removeLast());
        System.out.println(list.removeFirst());
    }
}
