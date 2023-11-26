package java_7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author molk tan
 * 2023/11/26
 */
public class TryWithResourcesExample {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
