import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Subject {
    final public int maxStudentEnrolled = 30;
    static final public int maxEnrolledSubject = 8;
    static final public int maxAssignedSubject = 8;

    private boolean hasTeacher = false;
    private String name;
    private String code;
    private String description;
    private String subjectId;

    public Instructor instructor;
    private static ArrayList<String> subjectIds = new ArrayList<>();
    public static ArrayList<Subject> subjects = new ArrayList<>();

    private List<Student> enrolledStudents;

    // Constructor when no instructor is provided
    public Subject(String name, String code, String description,boolean hasTeacher) {
        this.name = name;
        this.code = code;
        this.description = description;
        this.subjectId = generateSubjectId(); // Generate ID locally
        this.enrolledStudents = new ArrayList<>();
        this.hasTeacher = hasTeacher;
    }

    // Constructor when an instructor is provided
    public Subject(String name, String code, String description, Instructor instructor,boolean hasTeacher) {
        this(name, code, description,hasTeacher);
        this.instructor = instructor;
    }

    private String generateSubjectId() {
        Random random = new Random();
        String newId;
        do {
            int randomNumber = random.nextInt(9000) + 1000; // Generates a random 4-digit number
            newId = "SUB" + randomNumber;
        } while (!isUniqueId(newId, subjectIds));
        subjectIds.add(newId);
        return newId;
    }

    private boolean isUniqueId(String id, ArrayList<String> idSet) {
        return !idSet.contains(id);
    }

    // Getters and setters for all attributes

    public String getName() {
        return name;
    }
    // Method to find subject by ID
    public static Subject findSubjectById(String id) {
        for (Subject subject : subjects) {
            if (subject.getSubjectId().equals(id)) {
                return subject;
            }
        }
        return null; // Subject not found
    }
    public static void addSubject(Subject subject) {
        subjects.add(subject);
        subjectIds.add(subject.getSubjectId());
    }
    // Method to delete a subject by ID
    public static boolean deleteSubjectById(String id) {
        Subject subjectToDelete = findSubjectById(id);
        if (subjectToDelete != null) {
            subjects.remove(subjectToDelete);
            subjectIds.remove(id);
            return true; // Subject deleted successfully
        }
        return false; // Subject not found
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public Instructor getInstructor() {
        return instructor;
    }
    public void removeInstructor() {
        this.instructor = null;


    }

    public Boolean hasTeacher(){
        if(instructor!=null) {
            this.hasTeacher = hasTeacher;
        }
        return hasTeacher;
    }
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
    List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(List<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }



    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void displayEnrolledStudents() {
        System.out.println("Enrolled Students for " + name + " (" + subjectId + "):");
        if (enrolledStudents.isEmpty()) {
            System.out.println("No students enrolled.");
        } else {
            System.out.println("+------------------------------------------------------+");
            System.out.println("| Student ID   | Name                                  |");
            System.out.println("+------------------------------------------------------+");
            for (Student student : enrolledStudents) {
                String studentId = student.getStudentId();
                String studentName = student.getFullName();
                // Truncate strings if they exceed column width
                studentId = Person.truncateString(studentId, 13);
                studentName = Person.truncateString(studentName, 37);
                // Pad the strings to align columns
                studentId = Person.padString(studentId, 13);
                studentName = Person.padString(studentName, 37);
                System.out.println("| " + studentId + "| " + studentName + "|");
            }
            System.out.println("+------------------------------------------------------+");
        }
    }
    public void unenrollStudent(Student student) {
        enrolledStudents.remove(student);
    }
    public static void displayAllSubjects() {
        System.out.println("+--------------------------------------------------------------------------------------------------------------------------+");
        System.out.println("|                                          Available Subjects                                                              |");
        System.out.println("+--------------------------------------------------------------------------------------------------------------------------+");
        System.out.println("| Name             | Code     | Description                          | Subject ID   | Instructor     |Enrolled Students    |");
        System.out.println("+--------------------------------------------------------------------------------------------------------------------------+");

        for (Subject subject : subjects) {
            String name = subject.getName();
            String code = subject.getCode();
            String description = subject.getDescription();
            String subjectId = subject.getSubjectId();
            String instructorName = formatInstructorName(subject.getInstructor());
            int enrolledStudentsCount = subject.getEnrolledStudents().size();

            // Truncate strings if they exceed column width
            name = Person.truncateString(name, 16);
            code = Person.truncateString(code, 8);
            description = Person.truncateString(description, 36);
            subjectId = Person.truncateString(subjectId, 12);
            instructorName = Person.truncateString(instructorName, 14); // Adjust the length as needed

            // Pad the strings to align columns
            name = Person.padString(name, 16);
            code = Person.padString(code, 8);
            description = Person.padString(description, 36);
            subjectId = Person.padString(subjectId, 12);
            instructorName = Person.padString(instructorName, 14); // Adjust the length as needed

            // Convert enrolled students count to string and pad it
            String enrolledStudentsStr = Integer.toString(enrolledStudentsCount);
            enrolledStudentsStr = Person.padString(enrolledStudentsStr, 18); // Adjust the length as needed

            System.out.println("| " + name + " | " + code + " | " + description + " | " + subjectId + " | " + instructorName + " | " + enrolledStudentsStr + "  |");
            System.out.println("+--------------------------------------------------------------------------------------------------------------------------+");

        }
    }


    // Helper method to format instructor's name as "F. LastName"
    private static String formatInstructorName(Instructor instructor) {
        if (instructor != null) {
            String[] nameParts = instructor.getFullName().split(" ");
            if (nameParts.length >= 2) {
                return nameParts[0].charAt(0) + ". " + nameParts[nameParts.length - 1];
            }
        }
        return "N/A"; // If no instructor or invalid name format
    }

    // Helper method to truncate a string if its length exceeds maxLength
   

    // Method to display enrolled subjects table
    public void displayEnrolledSubjectsTable() {
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
            subjectName = Person.truncateString(subjectName, 20);
            // Pad the strings to align columns
            subjectName = Person.padString(subjectName, 20);
            enrolledStatus = Person.padString(enrolledStatus, 15);

            System.out.println("| " + subjectName + " | " + enrolledStatus + " |");
        }

        System.out.println("+--------------------------------------+");
    }

    public static void searchSubjectsByName(String substring) {
        boolean found = false;
        for (Subject subject : subjects) {
            String subjectName = subject.getName().trim(); // Trim leading and trailing spaces
            if (!subjectName.isEmpty() && subjectName.toLowerCase().contains(substring.toLowerCase())) {
                System.out.println("Subject ID: " + subject.getSubjectId() + ", Subject Name: " + subject.getName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No instructors found with the provided substring("+substring+").");
        }
    }

    public static void displayAvailableInstructors(Subject subject) {
        System.out.println("Available Instructors for Subject: " + subject.getName());
        System.out.println("+===========================================================================+");
        System.out.println("| Instructor ID   | Instructor Name                | Assigned Subjects      |");
        System.out.println("+===========================================================================+");

        for (Instructor instructor : Instructor.instructors) {
            int assignedSubjectCount = instructor.getSizeOfAssignedSubjectsForInstructor(instructor);
            if (assignedSubjectCount < maxAssignedSubject) {
                String instructorId = instructor.getInstructorId();
                String instructorName = instructor.getFullName();
                // Truncate strings if they exceed column width
                instructorId = Person.truncateString(instructorId, 15);
                instructorName = Person.truncateString(instructorName, 30);
                // Pad the strings to align columns
                instructorId = Person.padString(instructorId, 15);
                instructorName = Person.padString(instructorName, 30);
                // Convert assigned subjects count to string and pad it
                String assignedSubjectsStr = Integer.toString(assignedSubjectCount);
                assignedSubjectsStr = Person.padString(assignedSubjectsStr, 18); // Adjust the length as needed
                System.out.println("| " + instructorId + " | " + instructorName + " | " + assignedSubjectsStr + "       |");
            }
        }
    }
    public static int getTotalSubjects() {
        return subjects.size();

    }
    public boolean isInstructorAssigned(Instructor instructor) {
        return this.instructor != null && this.instructor.equals(instructor);
    }
    public boolean hasInstructorsAssigned() {
        return this.instructor != null;
    }
    public void unassignInstructor() {
        this.instructor = null;
    }

}
