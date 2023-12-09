public class Student implements Comparable<Student> {
    private int id;
    private double gpa;

    public Student(int id, double gpa) {
        this.id = id;
        this.gpa = gpa;
    }

    public int getIDNumber() {
        return id;
    }

    public double getGPA() {
        return gpa;
    }

    @Override
    public int compareTo(Student student) {
        if (this.gpa > student.gpa) {
            return 1;
        } else if (this.gpa < student.gpa) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "ID: " + id + ", GPA: " + gpa;
    }}