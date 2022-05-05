public class Teacher extends Person {
    private String subject;
    public static int count;
    private int studentCount;

    public Teacher(int id, String name, String subject) {
        super(id, name);
        this.subject = subject;
        count++;
    }

    public String getSubject() {
        return subject;
    }

    public void addStudentCount() {
        studentCount++;
    }

    @Override
    public void display() {
        System.out.println("Teacher : ID-" + super.getId() + ", Name : " + super.getName() + ", Subject : " + getSubject() + ", StudentCount : " + studentCount);
    }
}
