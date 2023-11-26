package java_4;

import java.nio.ByteBuffer;

/**
 * @author molk tan
 * 2023/11/26
 */
public class BufferExample {
    public static void main(String[] args) {
        try {
            String data = "Java NIO Example";
            ByteBuffer buffer = ByteBuffer.allocate(48);
            buffer.clear();
            buffer.put(data.getBytes());
            buffer.flip();  // make buffer ready for reading

            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get()); // read 1 byte at a time
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
