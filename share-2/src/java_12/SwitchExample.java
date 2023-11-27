package java_12;

/**
 * @author molk tan
 * 2023/11/27
 */
public class SwitchExample {
    enum Day {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

    public static void main(String[] args) {
        var day = Day.MONDAY;

        String result = switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> "Weekend";
            case TUESDAY -> "Working day";
            default -> "Midweek";
        };

    }
}
