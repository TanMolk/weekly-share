package java_7;

/**
 * @author molk tan
 * 2023/11/26
 */
public class SwitchStringExample {
    public static void main(String[] args) {
        String day = "MONDAY";

        switch (day) {
            case "MONDAY":
                System.out.println("It's Monday!");
                break;
            case "FRIDAY":
                System.out.println("It's Friday!");
                break;
        }
    }
}
