package java_21;

/**
 * @author molk tan
 * 2023/11/27
 */
public class VirtualThreadExample {

    public static void main(String[] args) {
        //lighter than thread

        while (true) {
//            new Thread(() -> {
//                try {
//                    System.out.println(Thread.currentThread().threadId());
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }).start();

            Thread.ofVirtual().start(() -> {
                try {
                    System.out.println(Thread.currentThread().threadId());
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
    }
}
