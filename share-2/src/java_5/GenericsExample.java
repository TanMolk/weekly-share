package java_5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author molk tan
 * 2023/11/26
 */
public class GenericsExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Java");

        // Before Java 5, String need be forced cast from Object.
        for (String s : list) {
            System.out.println(s);
        }

        MyGenerics<List<String>> myGenerics = new MyGenerics<>();
        myGenerics.me = list;

        System.out.println(myGenerics);
    }

    static class MyGenerics<E> {
        E me;

        @Override
        public String toString() {
            return me + " is me";
        }
    }
}
