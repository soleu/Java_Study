package SchoolSystem;

import java.util.ArrayList;
import java.util.List;


public class SchoolManager {
    private static SchoolManager instance = new SchoolManager();
    private List<Person> people = new ArrayList<>();

    public static SchoolManager getInstance() {
        return instance;
    }

    public void addMember(Person person) {
        people.add(person);
    }

    public void displayMemberAll() {
        System.out.println("\n-------- School Member --------\n");
        for (Person person : people) {
            person.display();
        }
    }
}
