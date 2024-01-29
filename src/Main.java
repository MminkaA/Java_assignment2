import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Student student_1 = new Student("Azat", "Bolatbekov", 2.8);
        Student student_2 = new Student("Biba", "Koszhanova", 3.3);
        Employee employee_1 = new Employee("Nurislam", "Meiramov", "Manager", 62490.90);
        Employee employee_2 = new Employee("Sultan", "Kissamedinov", "Developer", 72500.00);
        people.add(employee_1);
        people.add(employee_2);
        people.add(student_1);
        people.add(student_2);
        Collections.sort(people);
        printData(people);
    }

    public static void printData(Iterable <Person> people) {
        for (Person person : people) {
            System.out.printf("%s earns %.2f tenge\n", person.toString(), person.getPaymentAmount());
        }
    }
}
