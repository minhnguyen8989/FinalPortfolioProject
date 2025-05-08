import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class StudentData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Student> studentList = new LinkedList<>();

        System.out.println("Enter student data. Or Type 'done' when finished.");

        while (true) {
            String name;
            while (true) {
                System.out.print("Enter name (or type 'done' when finished): ");
                name = scanner.nextLine().trim();
                if (name.equalsIgnoreCase("done")) {
                    scanner.close();
                    saveStudentsToFile(studentList);
                    return;
                }
                if (!name.isEmpty()) break;
                System.out.println("Name cannot be empty. Please enter a valid name.");
            }

            String address;
            while (true) {
                System.out.print("Enter address: ");
                address = scanner.nextLine().trim();
                if (!address.isEmpty()) break;
                System.out.println("Address cannot be empty. Please enter a valid address.");
            }

            double gpa = -1;
            while (true) {
                System.out.print("Enter GPA (0.0 - 4.0): ");
                try {
                    String input = scanner.nextLine().trim();
                    if (input.isEmpty()) {
                        System.out.println("GPA cannot be empty.");
                        continue;
                    }
                    gpa = Double.parseDouble(input);
                    if (gpa >= 0.0 && gpa <= 4.0) break;
                    else System.out.println("GPA must be between 0.0 and 4.0.");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a numeric value.");
                }
            }

            studentList.add(new Student(name, address, gpa));
        }
    }

    private static void saveStudentsToFile(LinkedList<Student> studentList) {
        Collections.sort(studentList);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("students.txt"))) {
            for (Student s : studentList) {
                writer.write(s.toString());
                writer.write("--------------------\n");
            }
            System.out.println("Student data written to 'students.txt'.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
