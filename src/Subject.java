import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Subject {
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
    public Boolean hasTeacher(){
        if(instructor!=null) {
            this.hasTeacher = hasTeacher;
        }
        return hasTeacher;
    }
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(List<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    // Other methods related to subject management

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }


    public void unenrollStudent(Student student) {
        enrolledStudents.remove(student);
    }
    public static void displayAllSubjects() {
        System.out.println("+--------------------------------------+");
        System.out.println("|          Available Subjects          |");
        System.out.println("+--------------------------------------+");
        System.out.println("| Name            | Code   | Description");
        System.out.println("+--------------------------------------+");

        for (Subject subject : subjects) {
            String name = subject.getName();
            String code = subject.getCode();
            String description = subject.getDescription();

            // Pad the strings to align columns
            name = padString(name, 16);
            code = padString(code, 8);
            description = padString(description, 36);

            System.out.println("| " + name + " | " + code + " | " + description + " |");
        }

        System.out.println("+--------------------------------------+");
    }

    private static String padString(String str, int length) {
        if (str.length() >= length) {
            return str.substring(0, length);
        } else {
            StringBuilder builder = new StringBuilder(str);
            while (builder.length() < length) {
                builder.append(" ");
            }
            return builder.toString();
        }
    }
}