package java_21;

import java.util.concurrent.StructuredTaskScope;

/**
 * @author molk tan
 * 2023/11/27
 */
public class ScopedValueExample {
    private static final ScopedValue<String> SCOPED_VALUE = ScopedValue.newInstance();

    public static void main(String[] args) {

        ScopedValue.runWhere(SCOPED_VALUE, "test1", () -> {
            System.out.println(SCOPED_VALUE.get());
        });

        ScopedValue.runWhere(SCOPED_VALUE, "test2", () -> {
            System.out.println(SCOPED_VALUE.get());
        });

        ScopedValue.Carrier main = ScopedValue.where(SCOPED_VALUE, "main");

        //ok
        System.out.println(main.get(SCOPED_VALUE));

        //error
        System.out.println(SCOPED_VALUE.get());
    }
}
