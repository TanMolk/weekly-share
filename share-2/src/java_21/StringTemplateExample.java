package java_21;

/**
 * @author molk tan
 * 2023/11/27
 */
public class StringTemplateExample {
    public static void main(String[] args) {
        var i = 1;
        var str = "Hello World";
        String s = STR. """
                \{ i }
                \{ str }
                \{str.equals(i) == false}
                \{i == 1 ? "Hello" : "World"}
                 """ ;

        System.out.println(s);
    }
}
