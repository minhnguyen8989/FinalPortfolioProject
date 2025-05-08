/**
 * The {@code Student} class represents a student with a name, address, and GPA.
 * It implements the {@code Comparable<Student>} interface to allow comparison
 * of students based on their names in a case-insensitive manner.
 */
public class Student implements Comparable<Student> {
    private String name;
    private String address;
    private double gpa;

    /**
     * Constructs a new {@code Student} with the specified name, address, and GPA.
     *
     * @param name    the name of the student
     * @param address the address of the student
     * @param gpa     the GPA of the student
     */
    public Student(String name, String address, double gpa) {
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    /**
     * Returns a string representation of the student, including name, address, and GPA.
     *
     * @return a formatted string describing the student
     */
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nGPA: " + gpa + "\n";
    }

    /**
     * Compares this student to another student by their names, ignoring case.
     *
     * @param other the student to be compared
     * @return a negative integer, zero, or a positive integer as this student's name
     *         is less than, equal to, or greater than the other student's name
     */
    @Override
    public int compareTo(Student other) {
        return this.name.compareToIgnoreCase(other.name);
    }
}
