package java_5;


//Here is static importing
import static java.lang.Math.sqrt;

/**
 * @author molk tan
 * 2023/11/26
 */
public class StaticImportExample {
    public static void main(String[] args) {
        double result = sqrt(25); // don't need "Math.sqrt"
        System.out.println(result);
    }
}
