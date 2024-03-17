import java.time.Year;
import java.util.ArrayList;
import java.util.Random;

public class Student extends Person  {
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


    // Static method to access role without instantiation

    public static String getStaticRole() {
        return "Student";
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

    private static ArrayList<String> enrolledSubjectIds = new ArrayList<>(); // Store enrolled subject IDs
    public int getTotalEnrolledSubjects() {
        int totalEnrolledSubjects = 0;
        for (Subject subject : Subject.subjects) {
            if (subject.getEnrolledStudents().contains(this)) {
                totalEnrolledSubjects++;
            }
        }
        return totalEnrolledSubjects;
    }

    public void displayEnrolledSubjectsTable() {
        System.out.println();
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("|                  Enrolled Subject Table                     |");
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("| Subject ID   | Subject Name         | Enrolled              |");
        System.out.println("+-------------------------------------------------------------+");

        for (Subject subject : Subject.subjects) {
            boolean isEnrolled = subject.getEnrolledStudents().contains(this);
            String enrolledStatus = isEnrolled ? "Yes" : "No";
            String subjectName = subject.getName();
            String subjectId = subject.getSubjectId();
            // Truncate strings if they exceed column width
            subjectName = truncateString(subjectName, 20);
            subjectId = truncateString(subjectId, 12);
            enrolledStatus = truncateString(enrolledStatus, 15);
            // Pad the strings to align columns
            subjectName = padString(subjectName, 20);
            subjectId = padString(subjectId, 12);
            enrolledStatus = padString(enrolledStatus, 15);

            System.out.println("| " + subjectId + " | " + subjectName + " | " + enrolledStatus + "      |");
        }

        // Print total enrolled subjects line with appropriate padding and truncation
        String totalEnrolledSubjectsLine = "| Total Enrolled Subjects: " + getTotalEnrolledSubjects();
        totalEnrolledSubjectsLine = padString(totalEnrolledSubjectsLine, 61);
        System.out.println(totalEnrolledSubjectsLine + " |");

        System.out.println("+-------------------------------------------------------------+");
        System.out.println();
    }
    public static String getRole() {
        return "Student";
    }



    // Helper method to truncate a string if its length exceeds maxLength

//    public void enrollInSubject(String subjectId) {
//        // Check if the subject ID is valid and exists in the system
//        Subject subject = Subject.findSubjectById(subjectId);
//        if (subject != null) {
//            // Check if the student is already enrolled in the subject
//            if (enrolledSubjectIds.contains(subjectId)) {
//                System.out.println("Student is already enrolled in this subject.");
//                return;
//            }
//
//            // Add the subject ID to the enrolledSubjectIds list for the student
//            enrolledSubjectIds.add(subjectId);
//            System.out.println("Student enrolled in " + subject.getName());
//
//            // Add the student to the list of enrolled students for the subject
//            subject.enrollStudent(this);
//        } else {
//            System.out.println("Subject not found!");
//        }
//    }
//    public boolean enrolledInSubject(Subject subject) {
//        // Check if the subject ID is valid and exists in the system
//
//        if (subject != null) {
//            // Check if the student is already enrolled in the subject
//            if (enrolledSubjectIds.contains(subject.getSubjectId())) {
//                System.out.println("Student is already enrolled in this subject.");
//                return true;
//            }
//        } else {
//            System.out.println("Subject not found!");
//        }
//        return false;
//    }
//    public void unenrollFromSubject(Subject subject) {
//        // Check if the subject ID is valid and exists in the system
//
//        if (subject != null) {
//            // Remove the subject ID from the enrolledSubjectIds list for the student
//            enrolledSubjectIds.remove(subject.getSubjectId());
//            // Remove the student from the list of enrolled students for the subject
//            subject.unenrollStudent(this); // Pass the student object
//            System.out.println("Student unenrolled from subject: " + subject.getName());
//        } else {
//            System.out.println("Subject not found!");
//        }
//    }

}
