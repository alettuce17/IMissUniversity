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

    public void assignSubject(String subject) {
        // Implement your logic here to assign a subject to the instructor
        // For demonstration purposes, let's just print the assigned subject
        System.out.println("Subject assigned to " + getFullName() + ": " + subject);
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
    public int getSizeOfAssignedSubjectsForInstructor(Instructor instructor) {
        int count = 0;
        for (Subject subject : Subject.subjects) {
            if (subject.getInstructor() != null && subject.getInstructor().equals(instructor)) {
                count++;
            }
        }
        return count;
    }

}
