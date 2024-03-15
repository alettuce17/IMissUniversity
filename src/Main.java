import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Subject subject1 = new Subject("Mathematics", "MATH101", "Introduction to Mathematics", true);
        Subject subject2 = new Subject("Physics", "PHYS101", "Introduction to Physics", true);
        Subject subject3 = new Subject("Biology", "BIO101", "Introduction to Biology", true);
        Subject subject4 = new Subject("Chemistry", "CHEM101", "Introduction to Chemistry", true);
        Subject subject5 = new Subject("English", "ENG101", "Introduction to English Literature", true);

        // Add subjects to the list of subjects
        Subject.addSubject(subject1);
        Subject.addSubject(subject2);
        Subject.addSubject(subject3);
        Subject.addSubject(subject4);
        Subject.addSubject(subject5);

        // Display all subjects
        Subject.displayAllSubjects();
        // Example usage
        Instructor instructor1 = new Instructor("John", "Doe", "123 Street", 35);
        Instructor instructor2 = new Instructor("Jane", "Smith", "456 Avenue", 40);

        // Add instructors to the list
        Instructor.addInstructor(instructor1);
        Instructor.addInstructor(instructor2);

        // Search for an instructor by ID
        String searchId = instructor1.getInstructorId(); // Using the ID of the first instructor
        Instructor foundInstructor = Instructor.findInstructorById(searchId);

        if (foundInstructor != null) {
            System.out.println("Instructor found:");
            System.out.println("Name: " + foundInstructor.getFullName());
            System.out.println("ID: " + foundInstructor.getInstructorId());
            System.out.println("Age: " + foundInstructor.getAge());
            // You can print other details if needed
        } else {
            System.out.println("Instructor not found with ID: " + searchId);
        }
        Student student1 = new Student("John", "Doe", "123 Street", 35);
        Student student2 = new Student("Jane","asd", "Smith", "456 Avenue", 40);


        // Add students to the list
        Student.addStudent(student1);

        Student.addStudent(student2);

        // Search for an student by ID
        String searchsId = student1.getStudentId(); // Using the ID of the first student
        Student foundStudent = Student.findStudentById(searchsId);

        if (foundStudent != null) {
            System.out.println("Student found:");
            System.out.println("Name: " + foundStudent.getFullName());
            System.out.println("ID: " + foundStudent.getStudentId());
            System.out.println("Age: " + foundStudent.getAge());
            // You can print other details if needed
        } else {
            System.out.println("Student not found with ID: " + searchsId);
        }

        System.out.println("\n" +
                " __          __    _                                _            _____  __  __  _            _    _         _                         _  _          _     \n" +
                " \\ \\        / /   | |                              | |          |_   _||  \\/  |(_)          | |  | |       (_)                       (_)| |        ( )    \n" +
                "  \\ \\  /\\  / /___ | |  ___  ___   _ __ ___    ___  | |_  ___      | |  | \\  / | _  ___  ___ | |  | | _ __   _ __   __ ___  _ __  ___  _ | |_  _   _|/ ___ \n" +
                "   \\ \\/  \\/ // _ \\| | / __|/ _ \\ | '_ ` _ \\  / _ \\ | __|/ _ \\     | |  | |\\/| || |/ __|/ __|| |  | || '_ \\ | |\\ \\ / // _ \\| '__|/ __|| || __|| | | | / __|\n" +
                "    \\  /\\  /|  __/| || (__| (_) || | | | | ||  __/ | |_| (_) |   _| |_ | |  | || |\\__ \\\\__ \\| |__| || | | || | \\ V /|  __/| |   \\__ \\| || |_ | |_| | \\__ \\\n" +
                "     \\/  \\/  \\___||_| \\___|\\___/ |_| |_| |_| \\___|  \\__|\\___/  _|_____||_|  |_||_||___/|___/ \\____/ |_| |_||_|  \\_/  \\___||_|_  |___/|_| \\__| \\__, | |___/\n" +
                "                                                                                                                                               __/ |      \n" +
                "  _    _                                      _           __    __                                                           _               |___/       \n" +
                " | |  | |       (_)                       (_)| |          |  \\/  |                                                          | |                           \n" +
                " | |  | | _ __   _ __   __ ___  _ __  ___  _ | |_  _   _  | \\  / |  __ _  _ __    __ _   __ _   ___  _ __ ___    ___  _ __  | |_                          \n" +
                " | |  | || '_ \\ | |\\ \\ / // _ \\| '__|/ __|| || __|| | | | | |\\/| | / _` || '_ \\  / _` | / _` | / _ \\| '_ ` _ \\  / _ \\| '_ \\ | __|                         \n" +
                " | |__| || | | || | \\ V /|  __/| |   \\__ \\| || |_ | |_| | | |  | || (_| || | | || (_| || (_| ||  __/| | | | | ||  __/| | | || |_                          \n" +
                "  \\____/ |_| |_||_|  \\_/  \\___||_|   |___/|_| \\__| \\__, | |_|  |_| \\__,_||_| |_| \\__,_| \\__, | \\___||_| |_| |_| \\___||_| |_| \\__|                         \n" +
                "                                                    __/ |                                __/ |                                                            \n" +
                "  _____               __  _  _  _                  |___/              _                 |___/                                                             \n" +
                " |  __ \\             / _|(_)| |(_)                / ____|            | |                                                                                  \n" +
                " | |__) |_ __  ___  | |_  _ | | _  _ __    __ _  | (___   _   _  ___ | |_  ___  _ __ ___                                                                  \n" +
                " |  ___/| '__|/ _ \\ |  _|| || || || '_ \\  / _` |  \\___ \\ | | | |/ __|| __|/ _ \\| '_ ` _ \\                                                                 \n" +
                " | |    | |  | (_) || |  | || || || | | || (_| |  ____) || |_| |\\__ \\| |_|  __/| | | | | |                                                                \n" +
                " |_|    |_|   \\___/ |_|  |_||_||_||_| |_| \\__, | |_____/  \\__, ||___/ \\__|\\___||_| |_| |_|                                                                \n" +
                "                                           __/ |           __/ |                                                                                          \n" +
                "                                          |___/           |___/                                                                                           \n");

        while (true) {
            int choice =-1;
            try {
                System.out.println("+==========================================================================================================================+\n" +
                        "│"+padStringMiddle(" ",122)+"│\n" +
                        "│"+padStringMiddle("Main Menu",122)+"│\n" +
                        "│"+padStringMiddle(" ",122)+"│\n" +
                        "+==========================================================================================================================+\n" +
                        "│"+padStringMiddle(" ",122)+"│\n" +
                        "│"+padStringMiddle("Main Menu",31)+"│" + padStringMiddle("Main Menu",29)+ "│"+  padStringMiddle("Main Menu",30)+ "│"+  padStringMiddle("Main Menu",29)+"│\n"+
                        "│"+padStringMiddle(" ",122)+"│\n" +
                        "+--------------------------------------------------------------------------------------------------------------------------+\n" +
                        "│"+padStringMiddle(" ",31)+"│" + padStringMiddle(" ",29)+ "│"+  padStringMiddle(" ",30)+ "│"+  padStringMiddle(" ",29)+"│\n"+
                        "│"+padStringMiddle("[1] DSASADSDA]",31)+"│" + padStringMiddle("[1] DSASADSDA",29)+ "│"+  padStringMiddle("[1] DSASADSDA",30)+ "│"+  padStringMiddle("[1] DSASADSDA",29)+"│\n"+
                        "│"+padStringMiddle(" ",31)+"│" + padStringMiddle(" ",29)+ "│"+  padStringMiddle(" ",30)+ "│"+  padStringMiddle(" ",29)+"│\n"+
                        "+--------------------------------------------------------------------------------------------------------------------------+\n" +
                        "│"+padStringMiddle("Main Menu",122)+"│\n" +
                        "+--------------------------------------------------------------------------------------------------------------------------+\n" +
                        "│"+padStringMiddle("Main Menu",122)+"│\n" +
                        "+--------------------------------------------------------------------------------------------------------------------------+\n" +
                        "│"+padStringMiddle("Main Menu",122)+"│\n" +
                        "+--------------------------------------------------------------------------------------------------------------------------+");


                choice = sc.nextInt();
                sc.nextLine();
                // Handle the user choice here
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("Please enter only integer that you'll choose to do in this program. :)  " );
            }

            switch (choice) {
                case 0:
                    // Go back to the main menu
                    break;
                case 1:
                    // Add
                    switch (options("Add")){
                        case 1:
                            sc.nextLine();
                            System.out.println("add student");
                            addPerson("Student");
                            System.out.println(Student.getStaticRole()); // Output: Student


                            break;
                        case 2:
                            sc.nextLine();
                            addPerson("Instructor");
                            break;
                        case 3:
                            System.out.println("add subject");
                            addSubject();
                    }
                    break;
                case 2:
                    // Edit
                    switch (options("Edit")){
                        case 1:
                            System.out.println("edit student");
                            sc.nextLine();
                            // Validate first if there are currently available students
                            if(!Student.students.isEmpty()){
                                editPerson("Student");
                            }else {
                               noInput("Student");
                            }
                            break;
                        case 2:
                            System.out.println("edit instructor");
                            sc.nextLine();
                            if(!Instructor.instructors.isEmpty()) {
                                editPerson("Instructor");
                            }else {
                                noInput("Instructor");
                            }
                            break;
                        case 3:
                            sc.nextLine();
                            System.out.println("edit subject");
                            if(!Subject.subjects.isEmpty()){
                                editSubject();
                            }else {
                                noInput("Subject");
                            }

                        }
                    break;
                case 3:
                    // Delete
                    switch (options("Delete")){
                        case 1:
                            sc.nextLine();
                            if(!Student.students.isEmpty()){
                                System.out.println("delete student");

                                boolean validStudentId = false;
                                Student student = null;
                                while (!validStudentId) {
                                    // Prompt the user to input student details
                                    System.out.println("Enter student ID:");
                                    String studentId = sc.nextLine();

                                    // Find the student based on the provided ID
                                    student = Student.findStudentById(studentId);
                                    if (student != null) {
                                        System.out.println("Match");
                                        System.out.println("Are you sure you want to delete "+student.getFullName()+"?");
                                        Student.deleteStudentById(student.getStudentId());
                                        validStudentId = true;
                                    }
                                }
                            }else {
                                noInput("Student");
                            }

                            break;
                        case 2:

                            System.out.println("delete instructor");
                            sc.nextLine();
                            if(!Student.students.isEmpty()) {

                                boolean validInstructorId = false;
                                Instructor instructor = null;
                                while (!validInstructorId) {
                                    // Prompt the user to input instructor details
                                    System.out.println("Enter instructor ID:");
                                    String instructorId = sc.nextLine();

                                    // Find the instructor based on the provided ID
                                    instructor = Instructor.findInstructorById(instructorId);
                                    if (instructor != null) {
                                        System.out.println("Match");
                                        System.out.println("Are you sure you want to delete "+instructor.getFullName()+"?");
                                        Student.deleteStudentById(instructor.getInstructorId());
                                        validInstructorId = true;

                                    }
                                }
                            }else {
                                noInput("Instructor");
                            }
                            break;
                        case 3:
                            System.out.println("delete subject");
                            sc.nextLine();
                            if(!Subject.subjects.isEmpty()) {

                                boolean validSubjectId = false;
                                Subject subject = null;
                                while (!validSubjectId) {
                                    // Prompt the user to input subject details
                                    System.out.println("Enter subject ID:");
                                    String subjectId = sc.nextLine();

                                    // Find the subject based on the provided ID
                                    subject = Subject.findSubjectById(subjectId);
                                    if (subject != null) {
                                        System.out.println("Match");
                                        System.out.println("Are you sure you want to delete " + subject.getName() + "?");
                                        Subject.deleteSubjectById(subject.getSubjectId());
                                        validSubjectId = true;
                                    } else {
                                        System.out.println("No match");
                                    }
                                }
                            }else {
                                noInput("Subject");
                            }
                            break;
                    }
                    break;
                case 4:
                    // Search by String


                    switch (options("Search")){

                        case 1:
                            sc.nextLine();
                            if(!Student.students.isEmpty()) {
                                String confirmation;
                                do{
                                System.out.println("Search student:");
                                sc.nextLine();
                                Student.searchStudentsByName(search(sc));
                                do {
                                    System.out.println("Do you still want to search(yes/no)?");
                                    confirmation = sc.nextLine();
                                    if (confirmation.equalsIgnoreCase("yes")) {
                                        System.out.println("Enter another student name you want to search :)");
                                        break;
                                    } else if (confirmation.equalsIgnoreCase("no")) {
                                        System.out.println("Returning to the main menu.");
                                        break;
                                    }else {
                                        System.out.println("Pease enter a valid keyword");
                                    }
                                }while (true);
                                }while (confirmation.equalsIgnoreCase("no"));
                            }else {
                                noInput("Student");
                            }
                            break;
                        case 2:
                            sc.nextLine();
                            if(!Instructor.instructors.isEmpty()) {
                                System.out.println("Search instructor");
                                sc.nextLine();
                                Instructor.searchInstructorsByName(search(sc));
                            }else {
                                noInput("Instructor");
                            }
                            break;
                        case 3:
                            sc.nextLine();
                            if(!Subject.subjects.isEmpty()){
                                System.out.println("Search subject");
                                sc.nextLine();
                                Subject.searchSubjectsByName(search(sc));
                            }else {
                                noInput("Subject");
                            }
                            break;
                    }
                    break;
                case 5:
                    // Display
                    switch (options("Display")){
                        case 1:
                            sc.nextLine();
                            System.out.println("Display student");
                            if(!Student.students.isEmpty()){
                                Student student = Student.findStudentById(search(sc,"Student"));
                                if(student!=null){
                                    student.displayInfo();
                                    student.getFullName();

                                    if(student.getTotalEnrolledSubjects()!=0) {
                                        student.displayEnrolledSubjectsTable();
                                    }else {
                                        System.out.println("There are currently no subject enrolled for "+student.getFullName());
                                        String confirmation ="";
                                        if(!Subject.subjects.isEmpty()) {
                                            while (!confirmation.equalsIgnoreCase("yes") || !confirmation.equalsIgnoreCase("no")) {
                                                System.out.println("Do you want to enroll a subject?");
                                                confirmation = sc.nextLine();
                                                if (confirmation.equalsIgnoreCase("yes")) {
                                                    enrollStudentToSubject(student);
                                                } else if (confirmation.equalsIgnoreCase("no")) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }else {
                                    System.out.println("There are match for the Student name you entered :( ");
                                }
                            }else{
                                noInput("Student");
                            }
                            break;
                        case 2:
                            sc.nextLine();
                            System.out.println("Search instructor");
                            if(!Instructor.instructors.isEmpty()){
                                Instructor instructor = Instructor.findInstructorById(search(sc,"Instructor"));
                                if(instructor!=null){
                                    instructor.displayInfo();
                                    instructor.getFullName();
                                    instructor.displayHandledSubjects();

                                    if(instructor.getSizeOfAssignedSubjectsForInstructor()!=0) {
                                    }else {
                                        System.out.println("There are currently no subject assigned for " + instructor.getFullName());
                                        String confirmation = "";
                                        if (!Subject.subjects.isEmpty()) {
                                            while (!confirmation.equalsIgnoreCase("yes") || !confirmation.equalsIgnoreCase("no")) {
                                                System.out.println("Do you want to assign a subject?");
                                                confirmation = sc.nextLine();
                                                if (confirmation.equalsIgnoreCase("yes")) {
                                                    assignInstructorToSubject(instructor);
                                                } else if (confirmation.equalsIgnoreCase("no")) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }else {
                                    System.out.println("There are match for the Student name you entered :( ");
                                }
                            }else {
                                noInput("Instructor");
                            }
                            break;
                        case 3:
                            sc.nextLine();
                            if(!Subject.subjects.isEmpty()) {
                                sc.nextLine();
                                System.out.println("Display enrolled Students in the Subject");
                                System.out.println("Enter Subject ID:");
                                String subjectId = sc.nextLine();
                                Subject subject = Subject.findSubjectById(subjectId);
                                if (subject != null) {
                                    subject.displayEnrolledStudents();
                                }
                            }else{
                                noInput("Subject");
                            }
                            break;
                    }
                    break;
                case 6:
                    System.out.println("┌───────────────────┐");
                    System.out.println("\tEnroll Student");

                    if(!Student.students.isEmpty() && !Subject.subjects.isEmpty()){
                        String confirmation="";
                        do{
                            System.out.println("Enter Student ID you want to enroll:");
                            String id = sc.nextLine().trim();
                            Student student = Student.findStudentById(id);

                            if (student != null && student.getTotalEnrolledSubjects()<=Subject.maxEnrolledSubject) {
                                if (!confirmation.equalsIgnoreCase("yes")&& confirmation.equalsIgnoreCase("yes")) {
                                    break;
                                }
                                while (true) {
                                    System.out.println("Enter Subject ID:");
                                    String subjectId = sc.nextLine();
                                    Subject subject = Subject.findSubjectById(subjectId);
                                    if (subject != null && subject.getEnrolledStudents().size() != subject.maxStudentEnrolled) {
                                        student.enrollInSubject(subjectId);
                                        System.out.println("Student enrolled in " + subject.getName());
                                        while (true) {
                                            System.out.println("Do you still want to enroll a student? (yes/no)");
                                            confirmation = sc.nextLine().trim();
                                            if (confirmation.equalsIgnoreCase("yes")) {
                                                break;
                                            } else if (confirmation.equalsIgnoreCase("no")) {
                                                break;
                                            } else {
                                                System.out.println("Please enter a valid input");
                                            }
                                        }
                                        break;
                                    } else if (subject == null) {
                                        System.out.println("Please enter the correct Subject ID you wish to enroll");
                                        Subject.displayAllSubjects();
                                        while (true) {
                                            System.out.println("Do you still want to enroll a student?(yes/no)");
                                            confirmation = sc.nextLine().trim();
                                            if (confirmation.equalsIgnoreCase("yes")) {
                                                break;
                                            } else if (confirmation.equalsIgnoreCase("no")) {
                                                break;
                                            } else {
                                                System.out.println("Please enter a valid input");
                                            }


                                        }
                                    }
                                }
                            } else if(student.getTotalEnrolledSubjects() > Subject.maxEnrolledSubject){
                                System.out.println("Subject reach the maximum number");

                            }else {
                                System.out.println("Do you still want to enroll a student?");
                            }
                        }while (!confirmation.equalsIgnoreCase("no"));
                    }
                    else if(Student.students.isEmpty()&&Subject.subjects.isEmpty()) {
                        System.out.println("There are currently no student and a subject in this program. Please add a student and subject first:)");
                    }
                    else if(Student.students.isEmpty()){
                        System.out.println("There are no available students to be added. Please add a student first:)");
                    } else if (Subject.subjects.isEmpty()) {
                        System.out.println("There are no available subjects to be enrolled. Please add a subject first:)");
                    }

                    break;
                case 7:
                    System.out.println("┌────────────────────────────────────┐");
                    System.out.println("\tAssign Instructor to a subject");

                    if(!Student.students.isEmpty() && !Subject.subjects.isEmpty()){
                        System.out.println("Enter Instructor ID you want to be assigned:");
                        String id = sc.nextLine();
                        Instructor instructor = Instructor.findInstructorById(id);

                        if (instructor != null) {
                            assignInstructorToSubject(instructor);
                        }
                    }
                    else if (Instructor.instructors.isEmpty() && Subject.subjects.isEmpty()){
                        System.out.println("There are currently no student and a subject in this program. Please add a student and subject first:)");
                    }else if(Instructor.instructors.isEmpty()){
                        System.out.println("There are no available students to be added. Please add a student first:)");
                    } else if (Subject.subjects.isEmpty()) {
                        System.out.println("There are no available subjects to be enrolled. Please add a subject first:)");
                    }

                    break;
                case 8:
                    Subject.displayAllSubjects();
                    break;
                case 9:
                    System.out.println("Unenroll Student ");
                    boolean addMore = false;
                    do {
                        System.out.println("Enter the Student's ID you want to enroll:");
                        String id = sc.nextLine();
                        Student student = Student.findStudentById(id);
                        if(student !=null) {
                            student.displayEnrolledSubjectsTable();
                            System.out.println("Enter the subject ID you want to delete:");
                            String subjectId = sc.nextLine();
                            Subject subject = Subject.findSubjectById(subjectId);
                            student.unenrollFromSubject(subject);
                            System.out.println("Succesfully unenrolled " + student.getFullName());
                        }
                        while (true) {
                            System.out.println("Do you still want to unenroll a student?");
                            String add = sc.nextLine();
                            if (add.equalsIgnoreCase("yes")){
                                addMore = true;
                                break;
                            }else if(add.equalsIgnoreCase("no")){
                                addMore = false;
                                break;
                            }else {
                                System.out.println("Please enter a valid answer");
                            }
                        }
                    }while (addMore);
                    break;
                case 10:
                    System.out.println("Unassign Instructor");
                    System.out.println("Please subject id");
                    String id =  sc.nextLine();
                    Subject subject =Subject.findSubjectById(id);
                    subject.removeInstructor();
                    break;
                case 11:
                    System.out.println("Exiting the program. Goodbye!");
                    sc.close(); // Close the scanner
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    break;
            }

        }
    }
    public static String padStringMiddle(String str, int length) {
        if (str.length() >= length) {
            return str;
        } else {
            int spacesToAdd = length - str.length();
            int leftSpaces = spacesToAdd / 2;
            int rightSpaces = spacesToAdd - leftSpaces;
            StringBuilder paddedStr = new StringBuilder();
            for (int i = 0; i < leftSpaces; i++) {
                paddedStr.append(" ");
            }
            paddedStr.append(str);
            for (int i = 0; i < rightSpaces; i++) {
                paddedStr.append(" ");
            }
            return paddedStr.toString();
        }
    }
    private static int options(String option) {
        String paddedOption = padStringMiddle(option, 63); // Adjust the length as needed
        System.out.println("+===============================================================+");
        System.out.println("|" + paddedOption + "|");
        System.out.println("+===============================================================+");
        System.out.println("| [1] Student | [2] Instructor | [3] Subject | [4] Back to Main |");
        System.out.println("+===============================================================+");


        System.out.println("Choose the number you want to do:");

        int addChoice = -1;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                addChoice = sc.nextInt();
                if (addChoice < 1 || addChoice > 4) {
                    throw new IllegalArgumentException("Invalid choice. Please enter a number between 1 and 4.");
                }
                isValidInput = true;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("Invalid input. Please enter a valid number between 1 and 4.");
            }
        }

        return addChoice;
    }

    private static void addPerson(String role) {
        boolean addMore = true;
        while (addMore) {
            String firstName = validateName(sc, "first",false,false);
            String middleName = validateName(sc,"middle",true,false);
            String lastName = validateName(sc, "last",false,false);

            String address;
            do {
                System.out.println("Enter " + role + "'s address:");
                address = sc.nextLine();
            } while (!isValidAddress(address));

            int age;
            while (true) {
                System.out.println("Enter " + role + "'s age:");
                String ageInput = sc.nextLine();

                if (isNumeric(ageInput)) {
                    age = Integer.parseInt(ageInput);
                    if ((role.equalsIgnoreCase("Student") && age < 17) || (role.equalsIgnoreCase("Instructor") && age < 24)) {
                        System.out.println("Invalid age. " + role + " must be at least " + (role.equalsIgnoreCase("Student") ? "17" : "24") + " years old or older.");
                    } else {
                        break;
                    }
                } else {
                    System.out.println("Invalid age input. Please enter a valid number.");
                }
            }

            // Prompt for confirmation
            System.out.println("Confirm adding " + role + " with the following details:");
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
            System.out.println("Middle Name: " + middleName);
            System.out.println("Address: " + address);
            System.out.println("Age: " + age);
            String confirm;
            while(true) {
                System.out.println("Do you want to add this " + role + "? (yes/no)");
                confirm = sc.nextLine().toLowerCase();
                if(confirm.equalsIgnoreCase("no")){
                    System.out.println(role+" will not be added.");
                    break;
                }else if(confirm.equalsIgnoreCase("yes")){
                    break;
                }
                else {
                    System.out.println("Please enter a valid answer");
                }
            }
                if (confirm.equals("yes")) {
                    if (middleName == null) {
                        if (role.equalsIgnoreCase("Student")) {
                            // If middle name is not provided, construct student without middle name
                            Student newStudent = new Student(firstName, lastName, address, age);
                            Student.addStudent(newStudent);
                            System.out.println("Student added successfully:");
                            newStudent.displayInfo();

                            if (!Subject.subjects.isEmpty()) {
                                String confirmation;
                                System.out.println("There are currently " + Subject.getTotalSubjects() + " subjects");
                                while (true) {
                                    System.out.println("Do you want to " + newStudent.getFullName() + " enroll to a subject (yes/no)?");
                                    confirmation = sc.nextLine();
                                    if(confirmation.equalsIgnoreCase("yes")) {
                                        Subject.displayAllSubjects();
                                        enrollStudentToSubject(newStudent);
                                        break;
                                    }else if(confirmation.equalsIgnoreCase("no")){
                                        break;
                                    }else {
                                        System.out.println("Please enter a valid answer");
                                    }
                                }
                            }


                        } else {
                            Instructor newInstructor = new Instructor(firstName, lastName, address, age);
                            Instructor.addInstructor(newInstructor);
                            System.out.println("Instructor added successfully:");
                            newInstructor.displayInfo();
                            if (!Subject.subjects.isEmpty()) {
                                Subject.displayAllSubjects();
                                assignInstructorToSubject(newInstructor);
                            }
                        }
                    } else {
                        if (role.equalsIgnoreCase("Student")) {
                            // If middle name is provided, construct student with middle name
                            Student newStudent = new Student(firstName, middleName, lastName, address, age);
                            Student.addStudent(newStudent);
                            System.out.println("Student added successfully:");
                            newStudent.displayInfo();
                            if (!Subject.subjects.isEmpty()) {
                                String confirmation;
                                System.out.println("There are currently " + Subject.getTotalSubjects() + " subjects");
                                while (true) {
                                    System.out.println("Do you want to " + newStudent.getFullName() + " enroll to a subject (yes/no)?");
                                    confirmation = sc.nextLine();
                                    if(confirmation.equalsIgnoreCase("yes")) {
                                        Subject.displayAllSubjects();
                                        enrollStudentToSubject(newStudent);
                                        break;
                                    }else if(confirmation.equalsIgnoreCase("no")){
                                        break;
                                    }else {
                                        System.out.println("Please enter a valid answer");
                                    }
                                }
                            }
                        } else {
                            Instructor newInstructor = new Instructor(firstName, lastName, address, age);
                            Instructor.addInstructor(newInstructor);
                            System.out.println("Instructor added successfully:");
                            newInstructor.displayInfo();
                            if (!Subject.subjects.isEmpty()) {
                                Subject.displayAllSubjects();
                                assignInstructorToSubject(newInstructor);
                            }
                        }
                    }
                }

            while (true){
                System.out.println("Do you want to add another " + role + "? (yes/no)");
                String input = sc.nextLine().toLowerCase();
                if (input.equalsIgnoreCase("no")) {
                    System.out.println("Returning to the main menu.");
                    addMore = false;
                    break;
                }else if(input.equalsIgnoreCase("yes")){
                    System.out.println("Enter new "+role+" details:");
                    break;
                }else {
                    System.out.println("Please enter a valid answer");
                }
            }
        }
    }

    private static boolean isValidAddress(String address) {
        // Simple validation, just check if the address is not empty
        return !address.isEmpty();
    }

    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    private static String validateName(Scanner scanner, String role, boolean changeable, boolean forEdit) {
        String name;
        Pattern pattern = Pattern.compile("[a-zA-Z\\s]+"); // R egular expression to allow only letters and spaces

        if (!changeable){

            do {
                System.out.println("Enter your valid " + role + " name:");
                name = scanner.nextLine().trim(); // Trim leading and trailing spaces
                if (forEdit && name.isEmpty()) {

                    return null; // Return null if input is empty and it's for editing
                }
                if (!pattern.matcher(name).matches()) {
                    System.out.println("Please enter a valid name without special characters or numbers.");
                } else {
                    return name;
                }
            } while (!pattern.matcher(name).matches()); // Continue until a valid name is entered
            return name;
        }else {
            do {

                System.out.println("Enter your "+role+" name (leave empty if none):");
                name = scanner.nextLine().trim(); // Trim leading and trailing spaces
                if(name.isEmpty()){
                    return null;
                }
                if (!isValidMiddleName(name)) {
                    if (name.isEmpty()) {
                        break; // If middle name is empty, exit loop
                    }
                    if (!pattern.matcher(name).matches()) {
                        System.out.println("Please enter a valid name without special characters or numbers.))");
                    } else {
                        return name;
                    }
                }
            } while (!pattern.matcher(name).matches());
            return name;
        }
    }


    private static boolean isValidMiddleName(String middleName) {
        return middleName.isEmpty() || middleName.matches("[a-zA-Z\\s]+");
    }

    // Use method overloading to display
    private static void subjectDetails(Subject subject) {
        // Display the student's details including the generated student ID
        System.out.println("Subject details:");
        System.out.println("Name: " + subject.getName());
        System.out.println("Code: " + subject.getCode());
        System.out.println("Description: " + subject.getDescription());
        System.out.println("Subject ID: "+ subject.getSubjectId());
        Instructor assignedInstructor = subject.getInstructor();
        if (assignedInstructor != null) {
            System.out.println("Instructor details:");
            System.out.println("Name: " + assignedInstructor.getFullName());
            System.out.println("ID: " + assignedInstructor.getInstructorId());
        }
    }

    private static void addSubject(){
        sc.nextLine();
        // Prompt the user to input subject details
        System.out.println("Enter subject details:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Code: ");
        String code = sc.nextLine();
        System.out.print("Description: ");
        String description = sc.nextLine();

        // Create a new subject object
        Subject subject = new Subject(name, code, description, false);

        // Check if there's an instructor assigned to the subject
        if (subject.getInstructor() != null) {
            int availableInstructorsCount = countAvailableInstructors();

            // Print the message
            System.out.println("There are currently " + availableInstructorsCount + " instructors available.");
            String choice;
            boolean addInstructor = false;
            while (addInstructor!=true) {
                try {
                    System.out.println("Would you like to add an instructor? (yes/no)");
                    choice = sc.nextLine();
                    Instructor instructor;
                    if (choice.equalsIgnoreCase("yes")) {
                        boolean validInstructorId = false;
                        Subject.displayAvailableInstructors(subject);
                        while (!validInstructorId) {
                            // Prompt the user to input instructor details
                            System.out.println("Enter instructor ID:");
                            String instructorId = sc.nextLine();
                            // Find the instructor based on the provided ID
                            instructor = Instructor.findInstructorById(instructorId);

                            if (instructor != null) {
                                subject.setInstructor(instructor);
                                validInstructorId = true;
                                addInstructor=true;

                            } else {
                                String confirmation;
                                while (true){
                                    System.out.println("Do you still want to add (yes/no)?");
                                    confirmation = sc.nextLine();
                                    if (confirmation.equalsIgnoreCase("yes")){
                                        System.out.println("Enter the id again");
                                        break;
                                    }else if(confirmation.equalsIgnoreCase("no")){
                                        System.out.println("Returning to the main menu.");
                                        addInstructor=true;
                                        break;
                                    }else {
                                        System.out.println("Please enter a valid input");
                                    }
                                }
                                if(confirmation.equalsIgnoreCase("no")){
                                    System.out.println("Subject saved without an instructor.");
                                    addInstructor=true;
                                    break;
                                }
                            }
                        }
                    } else if (choice.equalsIgnoreCase("no")) {
                        System.out.println("Subject saved without an instructor.");
                            break;
                        }
                    else {
                        System.out.println("Please enter a valid input");
                    }

                } catch (Exception e) {
                    sc.nextLine();
                    System.out.println("Please enter a valid answer");
                }
            }

        }else {
           noInput("Instructor");
        }


        // Add subject to the list of subjects
        Subject.addSubject(subject);

        // Display subject details
        System.out.println("Subject added successfully:");
        subjectDetails(subject);
    }


    private static void editPerson(String role) {
        sc.nextLine();
        if (role.equalsIgnoreCase("Student")) {
            boolean validStudentId = false;
            Student student = null;
            String confirmation ="s";
            while (!validStudentId && !confirmation.equalsIgnoreCase("no")) {
                // Prompt the user to input student details
                System.out.println("Enter student ID:");
                String studentId = sc.nextLine();

                // Find the student based on the provided ID
                student = student.findStudentById(studentId);
                if (student != null) {
                    validStudentId = true;
                    System.out.println("Editing student: " + student.getFullName());

                    // Now proceed to edit the student's details
                    System.out.println("Enter new details for the student:");
                    String firstName = validateName(sc, "first", false, true);
                    String middleName = validateName(sc, "middle", true, true);
                    String lastName = validateName(sc, "last", false, true);

                    String address;
                    do {
                        System.out.println("Enter student's address:");
                        address = sc.nextLine();
                        if (address.isEmpty()) {
                            // Return the current address of the student to keep it unchanged
                            address = student.getAddress();
                            break;
                        }
                    } while (!isValidAddress(address));

                    int age;

                    while (true) {
                        System.out.println("Enter student's age (press Enter to keep it unchanged):");
                        String ageInput = sc.nextLine();
                        if (ageInput.isEmpty()) {
                            // Return a default value or perform any other action as needed
                            age = student.getAge(); // Assuming you want to keep the age unchanged
                            break;
                        }
                        if (isNumeric(ageInput)) {
                            age = Integer.parseInt(ageInput);
                            if (age < 24) {
                                System.out.println("Invalid age. student must be at least 24 years old or older.");
                            } else {
                                break;
                            }
                        } else {
                            System.out.println("Invalid age input. Please enter a valid number.");
                        }
                    }


                    // Update the student's details

                    student.setFirstName(firstName);
                    student.setMiddleName(middleName);
                    student.setLastName(lastName);
                    student.setAddress(address);
                    student.setAge(age);
                    student.displayInfo();

                    System.out.println("student details updated successfully.");
                } else {
                    while (true) {
                        System.out.println("Do you still want to search a Student Id (yes/no)?");
                        confirmation = sc.nextLine();
                        if (confirmation.equalsIgnoreCase("yes")) {
                            break;
                        } else if (confirmation.equalsIgnoreCase("no")) {
                            System.out.println("Returning to the main menu.");
                            break;
                        } else {
                            System.out.println("Please enter a valid answer");
                        }
                    }
                }
            }
        }
        else{
                boolean validInstructorId = false;
                Instructor instructor = null;
                while (!validInstructorId) {
                    // Prompt the user to input instructor details
                    System.out.println("Enter instructor ID:");
                    String instructorId = sc.nextLine();

                    // Find the instructor based on the provided ID
                    instructor = Instructor.findInstructorById(instructorId);
                    if (instructor != null) {
                        validInstructorId = true;
                        System.out.println("Editing instructor: " + instructor.getFullName());

                        // Now proceed to edit the instructor's details
                        System.out.println("Enter new details for the instructor:");
                        String firstName = validateName(sc, "first", false, true);
                        String middleName = validateName(sc, "middle", true, true);
                        String lastName = validateName(sc, "last", false, true);

                        String address;
                        do {
                            System.out.println("Enter instructor's address:");
                            address = sc.nextLine();
                            if (address.isEmpty()) {
                                // Return the current address of the student to keep it unchanged
                                address = instructor.getAddress();
                                break;
                            }
                        } while (!isValidAddress(address));

                        int age;

                        while (true) {
                            System.out.println("Enter instructor's age (press Enter to keep it unchanged):");
                            String ageInput = sc.nextLine();
                            if (ageInput.isEmpty()) {
                                // Return a default value or perform any other action as needed
                                age = instructor.getAge(); // Assuming you want to keep the age unchanged
                                break;
                            }
                            if (isNumeric(ageInput)) {
                                age = Integer.parseInt(ageInput);
                                if (age < 24) {
                                    System.out.println("Invalid age. Instructor must be at least 24 years old or older.");
                                } else {
                                    break;
                                }
                            } else {
                                System.out.println("Invalid age input. Please enter a valid number.");
                            }
                        }


                        // Update the instructor's details

                        instructor.setFirstName(firstName);
                        instructor.setMiddleName(middleName);
                        instructor.setLastName(lastName);
                        instructor.setAddress(address);
                        instructor.setAge(age);
                        instructor.displayInfo();

                        System.out.println("Instructor details updated successfully.");
                    } else {
                        String choice ="None";
                        System.out.println("No instructor found with the provided ID. Please try again.");
                        do{
                        System.out.println("Do you still want to enter Instructor's ID? (yes/no)");
                        if(!choice.equalsIgnoreCase("yes")||!choice.equalsIgnoreCase("no")){
                            System.out.println("Please enter a valid");
                        }
                        choice = sc.nextLine();}while (!choice.equalsIgnoreCase("yes")||!choice.equalsIgnoreCase("no"));
                        if (!choice.equalsIgnoreCase("yes")){
                          break;
                        }
                    }
                }
        }

    }
    private static void editSubject(){
        sc.nextLine();
        boolean validSubjectId = false;
        Subject subject = null;
        while (!validSubjectId) {
            // Prompt the user to input subject details
            System.out.println("Enter subject ID:");
            String subjectId = sc.nextLine();

            // Find the subject based on the provided ID
            subject = Subject.findSubjectById(subjectId);
            if (subject != null) {

                System.out.println("Edit");
                // Prompt the user to input subject details
                System.out.println("Enter subject details:");
                System.out.print("Name ("+subject.getName()+"): ");
                String name = sc.nextLine();
                System.out.print("Code ("+subject.getCode()+"): ");
                String code = sc.nextLine();
                System.out.print("Description("+subject.getDescription()+"): ");
                String description = sc.nextLine();
                subject.setName(name);
                subject.setDescription(code);
                subject.setDescription(description);
                validSubjectId = true;
            }else {
                break;
            }

        }
    }
    public static void enrollStudentToSubject( Student newStudent) {
        sc.nextLine();
        while(true) {
            System.out.println("Enter the subject ID You want to Enroll?");
            String subjectId = sc.nextLine();
            Subject subject = Subject.findSubjectById(subjectId);
            if (subject != null) {
                newStudent.enrollInSubject(subjectId);
                System.out.println("Student enrolled successfully in " + subject.getName());
                break;
            } else {
                System.out.println("Subject not found.");
                String confirmation;
                while(true){
                    System.out.println("Do you still want to enroll to subject (yes/no)?");
                    confirmation = sc.nextLine();
                    if (confirmation.equalsIgnoreCase("no")) {
                        break;
                    }else if(confirmation.equalsIgnoreCase("yes")){
                        break;
                    }else {
                        System.out.println("Please enter a valid answer");
                    }
                }
                if(confirmation.equalsIgnoreCase("no")){
                    break;
                }
            }
        }
    }
    public static void assignInstructorToSubject(Instructor newInstructor){
        boolean asssignMore = true;

        do {
            System.out.println("Enter the subject ID You want to be assigned: ");
            String subjectId = sc.nextLine();
            Subject subject = Subject.findSubjectById(subjectId);
            if (subject != null && !subject.isInstructorAssigned(newInstructor)&&!subject.hasInstructorsAssigned()) {
                subject.setInstructor(newInstructor);
                System.out.println("Instructor assigned successfully in " + subject.getName());
            } else if(subject == null) {
                System.out.println("Subject not found.");
            }else if(subject.isInstructorAssigned(newInstructor)) {
                System.out.println("Instructor is already assigned to this subject.");
            }else if(subject.hasInstructorsAssigned()){
                System.out.println("There are already assigned instructor for this subject " );
            }
            while (true){
                System.out.println("Do you still want to assign a subject for "+newInstructor.getFullName()+"?");
                String choice = sc.nextLine();
                if (choice.equalsIgnoreCase("yes")){
                    System.out.println("Assign Subject");
                    break;
                }else if(choice.equalsIgnoreCase("no")){
                    asssignMore=false;
                    break;
                }else {
                    System.out.println("Please enter a valid answer");
                }
            }
        }while(asssignMore);
    }
    public static String search(Scanner scanner) {
        System.out.println("Enter you want to search:");
        String searchPattern = scanner.nextLine().trim(); // Trim leading and trailing whitespace
        while (searchPattern.isEmpty()) { // Check if the search pattern is empty
            System.out.println("Search cannot be empty. Please enter a valid search pattern:");
            searchPattern = scanner.nextLine().trim(); // Prompt user again
        }
        return searchPattern;
    }
    public static String search(Scanner scanner, String role) {
        System.out.println("Enter the id of the "+role+":");
        String searchPattern = scanner.nextLine().trim(); // Trim leading and trailing whitespace
        while (searchPattern.isEmpty()) { // Check if the search pattern is empty
            System.out.println("Search cannot be empty. Please enter a valid search pattern:");
            searchPattern = scanner.nextLine().trim(); // Prompt user again
        }
        return searchPattern;
    }
    private static int countAvailableInstructors() {
        int count = 0;
        for (Instructor instructor : Instructor.instructors) {
            if (instructor.getSizeOfAssignedSubjectsForInstructor(instructor) < Subject.maxAssignedSubject) {
                count++;
            }
        }
        return count;
    }
    private static void noInput(String role){

        System.out.println("There are no "+role+" added yet.");
        String confirmation = "";
        while (!confirmation.equalsIgnoreCase("yes")) {
            System.out.println("Do you want to add a new "+role+" first(yes/no)?");
             confirmation = sc.nextLine();
            if (confirmation.equalsIgnoreCase("yes") && !role.equalsIgnoreCase("Subject")) {
                addPerson(role);
            } else if(confirmation.equalsIgnoreCase("yes") && role.equalsIgnoreCase("Subject")){
                addSubject();
            }else if (confirmation.equalsIgnoreCase("no")) {
                System.out.println("Returning to the main menu.");
                break;
            }else {
                System.out.println("Please enter a valid answer");

            }
        }

    }
}

