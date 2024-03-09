import java.time.Year;
import java.util.ArrayList;
import java.util.Random;

public class Student extends Person {
    private static ArrayList<String> studentIds = new ArrayList<>();
    public static ArrayList<Student> students = new ArrayList<>();
    private String studentId;

    public Student(String firstName, String lastName, String address, int age) {
        super(firstName, lastName, address, age);
        this.studentId = generateStudentId();
    }

    public Student(String firstName, String lastName) {
        super(firstName, lastName);
        this.studentId = generateStudentId();
    }

    public Student(String firstName, String middleName, String lastName, String address, int age) {
        super(firstName, middleName, lastName, address, age);
        this.studentId = generateStudentId();
    }
    public static Student findStudentById(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        System.out.println("No student found with ID: " + studentId);
        return null; // Student not found
    }
    private String generateStudentId() {
        int year = Year.now().getValue() % 100; // Get the last two digits of the current year
        Random random = new Random();
        String newId;
        do {
            int randomNumber = random.nextInt(9000) + 1000; // Generates a random 4-digit number
            newId = "ST" + year + "-" + randomNumber;
        } while (!isUniqueId(newId, studentIds));
        studentIds.add(newId);
        return newId;
    }

    public static void deleteStudentById(String studentId) {
        Student studentToDelete = findStudentById(studentId);
        if (studentToDelete != null) {
            students.remove(studentToDelete);
            System.out.println("Student with ID " + studentId + " deleted successfully.");
        }
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
    }
    public static void addStudent(Student student) {
        students.add(student);
    }
    private boolean isUniqueId(String id, ArrayList<String> idList) {
        return !idList.contains(id);
    }

    // Getter and setter for studentId
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}

