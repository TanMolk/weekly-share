package java_5;

/**
 * @author molk tan
 * 2023/11/26
 */
public class EnumExample {
    enum Day {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

    public static void main(String[] args) {
        Day day = Day.MONDAY;

        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            // ... other
        }
    }
}
