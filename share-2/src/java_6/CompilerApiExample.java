package java_6;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

/**
 * @author molk tan
 * 2023/11/26
 */
public class CompilerApiExample {
    public static void main(String[] args) {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int result = compiler.run(null, null, null, "MyClass.java");
        System.out.println("Compile result: " + result);
    }
}
