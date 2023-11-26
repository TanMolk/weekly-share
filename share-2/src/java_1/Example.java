package java_1;

/**
 * @author molk tan
 */
public class Example {

    // Hello World
    public static class HelloWorld {
        public static void main(String[] args) {
            System.out.println("Hello, world!");
        }
    }

    // simple usage of Thread
    static class SimpleThread extends Thread {
        public void run() {
            System.out.println("Thread Running");
        }
    }

    public static class ThreadExample {
        public static void main(String[] args) {
            SimpleThread t = new SimpleThread();
            t.start();
        }
    }

    // handler exception
    public static class ExceptionExample {
        public static void main(String[] args) {
            try {
                int[] a = new int[2];
                System.out.println("Access element three :" + a[3]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception thrown :" + e);
            }
            System.out.println("Out of the block");
        }
    }

    // GC. garbage collection is not running mutually!!!!
    static class GarbageCollectionExample {
        public static void main(String[] args) throws InterruptedException {
            GarbageCollectionExample e = new GarbageCollectionExample();
            e = null;

            // ask JVM GC, it's not used in normal situation
            System.gc();
            Thread.sleep(1000);
        }


        /**
         * Override the method invoked when this object get collected.
         */
        @Override
        protected void finalize() {
            System.out.println("Garbage collected from object");
        }
    }
}
