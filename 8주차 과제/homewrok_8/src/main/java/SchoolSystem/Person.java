package SchoolSystem;

public class Person {
    private int id;
    private String name;
    public static int count;

    public Person() {
        count++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
        count++;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void whoAreYou() {
        System.out.println("ID-" + id + ", Name:" + name);
    }

    public void display() {
        System.out.println("Person : ID-" + id + ", Name : " + name);
    }
}
