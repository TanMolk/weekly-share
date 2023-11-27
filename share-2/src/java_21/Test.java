package java_21;

/**
 * @author molk tan
 * 2023/11/27
 */
public class Test {


    public static void main(String[] args) {

        //Virtual Thread
        Thread.ofVirtual().start(() -> System.out.println("HELLO WORLD"));
        Thread.startVirtualThread(() -> System.out.println("LIGHTER"));
        System.out.println(Thread.currentThread().isVirtual());

        //Thread
        Thread.ofPlatform().start(() -> System.out.println("HELLO WORLD"));
        new Thread(() -> System.out.println("HELLO WORLD"));


    }
}
