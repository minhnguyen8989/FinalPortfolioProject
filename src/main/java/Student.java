
public class Student implements Comparable<Student> {
    private String name;
    private String address;
    private double gpa;

    public Student(String name, String address, double gpa) {
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nGPA: " + gpa + "\n";
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareToIgnoreCase(other.name);
    }
}
