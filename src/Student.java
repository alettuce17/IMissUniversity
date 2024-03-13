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
    public static void searchStudentsByName(String substring) {
        boolean found = false;
        for (Student student : students) {
            String studentName = student.getFullName().trim(); // Trim leading and trailing spaces
            if (!studentName.isEmpty() && !studentName.equals(" ") && studentName.toLowerCase().contains(substring.toLowerCase())) {
                System.out.println("Student ID: " + student.getStudentId() + ", Student Name: " + student.getFullName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No instructors found with the provided substring("+substring+").");
        }
    }
    private ArrayList<String> enrolledSubjectIds = new ArrayList<>(); // Store enrolled subject IDs
    public int getTotalEnrolledSubjects() {
        return enrolledSubjectIds.size();
    }
    public void displayEnrolledSubjectsTable() {
        System.out.println();
        System.out.println("+--------------------------------------+");
        System.out.println("| Enrolled Subject Table               |");
        System.out.println("+--------------------------------------+");
        System.out.println("| Subject Name        | Enrolled       |");
        System.out.println("+--------------------------------------+");

        for (Subject subject : Subject.subjects) {
            boolean isEnrolled = subject.getEnrolledStudents().contains(this);
            String enrolledStatus = isEnrolled ? "Yes" : "No";
            String subjectName = subject.getName();
            // Truncate strings if they exceed column width
            subjectName = truncateString(subjectName, 20);
            enrolledStatus = truncateString(enrolledStatus, 15);
            // Pad the strings to align columns
            subjectName = padString(subjectName, 20);
            enrolledStatus = padString(enrolledStatus, 15);

            System.out.println("| " + subjectName + " | " + enrolledStatus + " |");
        }

        System.out.println("+--------------------------------------+");
    }
    public static String truncateString(String str, int maxLength) {
        if (str.length() > maxLength) {
            return str.substring(0, maxLength - 3) + "...";
        }
        return str;
    }

    public static String padString(String str, int length) {
        if (str.length() >= length) {
            return str;
        } else {
            StringBuilder paddedStr = new StringBuilder(str);
            while (paddedStr.length() < length) {
                paddedStr.append(" ");
            }
            return paddedStr.toString();
        }
    }
    // Helper method to truncate a string if its length exceeds maxLength


}

