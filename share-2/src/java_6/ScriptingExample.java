package java_6;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @author molk tan
 * 2023/11/26
 */
public class ScriptingExample {
    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager(null);
        ScriptEngine engine = manager.getEngineByName("js");

        //before running it, you should add the dependent engine to your project
        engine.eval("print('Hello, World!')");
    }
}
