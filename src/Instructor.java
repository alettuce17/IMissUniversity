import java.time.Year;
import java.util.ArrayList;
import java.util.Random;

public class Instructor extends Person {
    private String instructorId;
    public static ArrayList<Instructor> instructors = new ArrayList<>();

    public Instructor(String firstName, String lastName, String address, int age) {
        super(firstName, lastName, address, age);
        this.instructorId = generateInstructorId();
        System.out.println(instructorId);
    }

    public Instructor(String firstName, String middleName, String lastName, String address, int age) {
        super(firstName, middleName, lastName, address, age);
        this.instructorId = generateInstructorId();
        System.out.println(instructorId);
    }

    private String generateInstructorId() {
        int year = Year.now().getValue() % 100; // Get the last two digits of the current year
        Random random = new Random();
        String newId;
        do {
            int randomNumber = random.nextInt(9000) + 1000; // Generates a random 4-digit number
            newId = "INS" + year + "-" + randomNumber;
        } while (!isUniqueId(newId));
        return newId;
    }

    private boolean isUniqueId(String id) {
        for (Instructor instructor : instructors) {
            if (instructor.getInstructorId().equals(id)) {
                return false;
            }
        }
        return true;
    }

    public static boolean anyInstructorHasAssignedSubjects() {
        for (Instructor instructor : instructors) {
            if (instructor.getSizeOfAssignedSubjectsForInstructor() > 0) {
                return true; // If any instructor has assigned subjects, return true immediately
            }
        }
        return false; // If no instructor has assigned subjects, return false
    }
    public static Instructor findInstructorById(String instructorId) {
        for (Instructor instructor : instructors) {
            if (instructor.getInstructorId().equals(instructorId)) {
                return instructor;
            }
        }
        System.out.println("No instructor found with ID: " + instructorId);
        return null; // Instructor not found
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Instructor ID: " + instructorId);
    }

    public static String getRole() {
        return "Instructor";
    }
    public void displayHandledSubjects() {
        System.out.println("Subjects handled by " + getFullName() + " (" + getInstructorId() + "):");
        System.out.println("+--------------------------------------+");
        System.out.println("| Subject Name        | Subject ID     |");
        System.out.println("+--------------------------------------+");

        for (Subject subject : Subject.subjects) {
            if (subject.getInstructor() != null && subject.getInstructor().equals(this)) {
                String subjectName = subject.getName();
                String subjectId = subject.getSubjectId();
                // Truncate strings if they exceed column width
                subjectName = truncateString(subjectName, 20);
                subjectId = truncateString(subjectId, 15);
                // Pad the strings to align columns
                subjectName = padString(subjectName, 20);
                subjectId = padString(subjectId, 15);

                System.out.println("| " + subjectName + " | " + subjectId + " |");
            }
        }

        String totalAssignedSubjectsLine = "| Total Assigned Subjects: " + getSizeOfAssignedSubjectsForInstructor();
        totalAssignedSubjectsLine = padString(totalAssignedSubjectsLine, 38);
        System.out.println(totalAssignedSubjectsLine + " |");

        System.out.println("+--------------------------------------+");
    }

    // Getter and setter for instructorId
    public String getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(String instructorId) {
        this.instructorId = instructorId;
    }

    public static void addInstructor(Instructor instructor) {
        instructors.add(instructor);
    }
    public static void searchInstructorsByName(String substring) {
        boolean found = false;
        for (Instructor instructor : instructors) {
            String instructorName = instructor.getFullName().trim(); // Trim leading and trailing spaces
            if (!instructorName.isBlank() && instructorName.toLowerCase().contains(substring.toLowerCase())) {
                System.out.println("Instructor ID: " + instructor.getInstructorId() + ", Instructor Name: " + instructor.getFullName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No instructors found with the provided substring("+substring+").");
        }
    }
    public static void deleteInstructorByID(String studentId) {
        Instructor instructorToDelete = findInstructorById(studentId);
        if (instructorToDelete != null) {
            instructors.remove(instructorToDelete);
            System.out.println("Student with ID " + studentId + " deleted successfully.");
        }
    }
    public int getSizeOfAssignedSubjectsForInstructor() {
        int count = 0;
        for (Subject subject : Subject.subjects) {
            if (subject.getInstructor() != null && subject.getInstructor().equals(this)) {
                count++;
            }
        }
        return count;
    }

    public int getSizeOfAssignedSubjectsForInstructor(Instructor instructor) {
        int count = 0;
        for (Subject subject : Subject.subjects) {
            if (subject.getInstructor() != null && subject.getInstructor().equals(instructor)) {
                count++;
            }
        }
        return count;
    }
    public static void displayAllInstructors() {
        System.out.println("+--------------------------------------------------------------------------------------------------------------------------+");
        System.out.println("|                                             All Instructors                                                              |");
        System.out.println("+--------------------------------------------------------------------------------------------------------------------------+");
        System.out.println("| Instructor ID        | Instructor Name                                                     | Assigned Subjects           |");
        System.out.println("+--------------------------------------------------------------------------------------------------------------------------+");

        for (Instructor instructor : instructors) {
            String instructorId = instructor.getInstructorId();
            String instructorName = instructor.getFullName();
            int assignedSubjectsCount = instructor.getSizeOfAssignedSubjectsForInstructor();

            // Truncate strings if they exceed column width
            instructorId = truncateString(instructorId, 20);
            instructorName = truncateString(instructorName, 35);
            String assignedSubjectsStr = Integer.toString(assignedSubjectsCount);
            assignedSubjectsStr = truncateString(assignedSubjectsStr, 25);

            // Pad the strings to align columns
            instructorId = padString(instructorId, 20);
            instructorName = padString(instructorName, 67);
            assignedSubjectsStr = padString(assignedSubjectsStr, 25);

            System.out.println("| " + instructorId + " | " + instructorName + " | " + assignedSubjectsStr + "   |");
        }

        // Print total instructors line with appropriate padding and truncation
        System.out.println("+--------------------------------------------------------------------------------------------------------------------------+");
        String totalInstructorsLine = "| Total Instructors: " + instructors.size();
        totalInstructorsLine = padString(totalInstructorsLine, 122);
        System.out.println(totalInstructorsLine + " |");
        System.out.println("+--------------------------------------------------------------------------------------------------------------------------+");
    }

}