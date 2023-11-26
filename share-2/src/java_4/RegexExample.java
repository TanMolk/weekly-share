package java_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author molk tan
 * 2023/11/26
 */

public class RegexExample {
    public static void main(String[] args) {
        // 创建 Pattern 对象
        Pattern r = Pattern.compile("\\bcat\\b");

        // 现在创建 matcher 对象
        Matcher m = r.matcher("The cat sat on the mat.");
        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
        } else {
            System.out.println("No match found.");
        }
    }
}

