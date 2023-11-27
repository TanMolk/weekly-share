package java_14;

/**
 * @author molk tan
 * 2023/11/27
 */
public class RecordExample {
    public static void main(String[] args) {
        record Person(String name, int age) {
        }

        Person person = new Person("1", 1);
        System.out.println(person);
    }
}
