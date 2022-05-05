public class Student extends Person {
    private int grade;
    public static int count;
    private int subjectCount;

    public Student() {
        count++;
    }

    public Student(int id, String name, int grade) {
        super(id, name);
        this.grade = grade;
        count++;
    }

    public void setId(int id) {
        super.setId(id);
    }

    public void setName(String name) {
        super.setName(name);
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void attendClass(Teacher teacher) {
        teacher.addStudentCount();
        subjectCount++;
    }

    @Override
    public void display() {
        System.out.println("Student : ID-" + super.getId() + ", Name : " + super.getName() + ", Grade : " + grade + ", SubjectCount : " + subjectCount);
    }
}
