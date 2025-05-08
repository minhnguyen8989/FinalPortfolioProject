import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testStudent {
    @Test
    public void testConstructorAndGetName() {
        Student student = new Student("Alice", "123 Main St", 3.5);
        assertEquals("Alice", student.getName());
    }

    @Test
    public void testToStringFormat() {
        Student student = new Student("Bob", "456 Elm St", 3.8);
        String expected = "Name: Bob\nAddress: 456 Elm St\nGPA: 3.8\n";
        assertEquals(expected, student.toString());
    }

    @Test
    public void testCompareTo_SameNameDifferentCase() {
        Student s1 = new Student("Charlie", "789 Pine St", 3.9);
        Student s2 = new Student("charlie", "111 Oak St", 3.2);
        assertEquals(0, s1.compareTo(s2));
    }

    @Test
    public void testCompareTo_DifferentNames() {
        Student s1 = new Student("Adam", "123 St", 3.0);
        Student s2 = new Student("Brian", "234 St", 3.5);
        assertTrue(s1.compareTo(s2) < 0);
        assertTrue(s2.compareTo(s1) > 0);
    }
}
