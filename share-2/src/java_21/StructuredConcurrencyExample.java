package java_21;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.StructuredTaskScope;

/**
 * @author molk tan
 * 2023/11/27
 */
public class StructuredConcurrencyExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        try (var scope = new StructuredTaskScope.ShutdownOnSuccess<Integer>();
             var scope2 = new StructuredTaskScope.ShutdownOnFailure()
        ) {
            //stop when success
            var task1 = scope.fork(() -> {
                System.out.println(1);
                return 1;
            });
            var task2 = scope.fork(() -> {
                System.out.println(2);
                return 2;
            });

            scope.join();
            System.out.printf("result -----> %s\n", scope.result());
            System.out.printf("task%s -----> %s\n", 1, task1.state());
            System.out.printf("task%s -----> %s\n", 2, task2.state());

            //stop when fails
            var task3 = scope2.fork(() -> {
                System.out.println(3);
                return 3;
            });

            var task4 = scope2.fork(() -> {
                System.out.println(4 / 0);
                return 4;
            });

            scope2.join();
//            scope2.throwIfFailed();
            System.out.printf("task%sR -----> %s\n", 3, task3.state());
            System.out.printf("task%s -----> %s\n", 4, task4.state());
        }
    }
}
