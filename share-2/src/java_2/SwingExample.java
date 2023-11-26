package java_2;

import javax.swing.*;

/**
 * @author molk tan
 * 2023/11/26
 */

public class SwingExample {
    public static void main(String[] args) {
        // 创建JFrame实例
        JFrame frame = new JFrame("Hello Java Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        // 创建一个标签
        JLabel label = new JLabel("Hello World", SwingConstants.CENTER);

        // 将标签添加到frame
        frame.add(label);
        frame.setVisible(true);
    }
}
