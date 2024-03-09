import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
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
        Student student2 = new Student("Jane", "Smith", "456 Avenue", 40);

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
            System.out.println("Missue");

                    System.out.println("┌───────────────────┐\n" +
                    "│___________________│\n" +
                    "│     Main          │\n" +
                    "│+-+-+-+-+ +-+-+-+-+│");
            System.out.println("│1. Add             │");
            System.out.println("│2. Edit            │");
            System.out.println("│3. Delete          │");
            System.out.println("│4. Search          │");
            System.out.println("│5. Display         │");
            System.out.println("│6. Exit            │");
            System.out.println("└───────────────────┘");
            System.out.println("Choose the number you want to do: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    // Add
                    switch (options("Add")){
                        case 1:
                            System.out.println("add student");
                            addPerson("Student");


                            break;
                        case 2:
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
                            editPerson("Student");
                            break;
                        case 2:
                            System.out.println("edit instructor");
                            editPerson("Instructor");
                            break;
                        case 3:
                            System.out.println("edit subject");
                            editSubject();
                    }
                    break;
                case 3:
                    // Delete
                    switch (options("Delete")){
                        case 1:
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

                            break;
                        case 2:
                            System.out.println("delete instructor");
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
                            break;
                        case 3:
                            System.out.println("delete subject");
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
                                    System.out.println("Match");
                                    System.out.println("Are you sure you want to delete "+subject.getName()+"?");
                                    Subject.deleteSubjectById(subject.getSubjectId());
                                    validSubjectId = true;
                                }else{
                                    System.out.println("No match");
                                }
                            }
                            break;
                    }
                    break;
                case 4:
                    // Search by id
                    switch (options("Search")){
                        case 1:
                            System.out.println("Search student");
                            break;
                        case 2:
                            System.out.println("Search instructor");
                            break;
                        case 3:
                            System.out.println("Search subject");
                    }
                    break;
                case 5:
                    // Display
                    switch (options("Display")){
                        case 1:
                            System.out.println("Search student");
                            break;
                        case 2:
                            System.out.println("Search instructor");
                            break;
                        case 3:
                            System.out.println("Search subject");
                    }
                    break;
                case 6:
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
    private static int options(String option) {
        System.out.println("│││││"+option+"│││││");

        System.out.println("┌───────────────────┐");
        System.out.println("│  1. Student       │");
        System.out.println("│  2. Instructor    │");
        System.out.println("│  3. Subject       │");
        System.out.println("└───────────────────┘");

        System.out.println("What do you want to "+ option + "?");


        int addChoice = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                addChoice = sc.nextInt();
                if (addChoice < 1 || addChoice > 3) {
                    throw new IllegalArgumentException("Invalid choice. Please enter a number between 1 and 3.");
                }
                isValidInput = true;
            } catch (Exception e) {
                sc.next();
                System.out.println("Invalid input. Please enter a valid number between 1 and 3.");
            }
        }


        return addChoice;
    }

    private static void addPerson(String role) {
        Scanner sc = new Scanner(System.in);
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

            System.out.println("Do you want to add this " + role + "? (yes/no)");
            String confirm = sc.nextLine().toLowerCase();
            if (confirm.equals("yes")) {
                if (middleName == null) {
                    if (role.equalsIgnoreCase("Student")) {
                        // If middle name is not provided, construct student without middle name
                        Student newStudent = new Student(firstName, lastName, address, age);
                        Student.addStudent(newStudent);
                        System.out.println("Student added successfully:");
                        newStudent.displayInfo();

                        if (Subject.subjects!=null) {
                            Subject.displayAllSubjects();
                            System.out.println("Enter the subject ID You want to Enroll?");
                            enrollStudent(newStudent);
                        }

                    } else {
                        Instructor newInstructor = new Instructor(firstName, lastName, address, age);
                        Instructor.addInstructor(newInstructor);
                        System.out.println("Instructor added successfully:");
                        newInstructor.displayInfo();
                    }
                } else {
                    if (role.equalsIgnoreCase("Student")) {
                        // If middle name is provided, construct student with middle name
                        Student newStudent = new Student(firstName, middleName, lastName, address, age);
                        Student.addStudent(newStudent);
                        System.out.println("Student added successfully:");
                        newStudent.displayInfo();
                    } else {
                        Instructor newInstructor = new Instructor(firstName, middleName, lastName, address, age);
                        Instructor.addInstructor(newInstructor);
                        System.out.println("Instructor added successfully:");
                        newInstructor.displayInfo();
                    }
                }
            }

            System.out.println("Do you want to add another " + role + "? (yes/no)");
            String input = sc.nextLine().toLowerCase();
            if (!input.equals("yes")) {
                addMore = false;
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
                    System.out.println("Your " + role + " name is unusual.");
                    System.out.println("Please enter a valid name without special characters or numbers._))" + name);
                } else {
                    return name;
                }
            } while (!pattern.matcher(name).matches()); // Continue until a valid name is entered
            return name;
        }else {
            do {

                System.out.println("Enter your name (leave empty if none):");
                name = scanner.nextLine().trim(); // Trim leading and trailing spaces
                if(name.isEmpty()){
                    return null;
                }
                if (!isValidMiddleName(name)) {
                    if (name.isEmpty()) {
                        break; // If middle name is empty, exit loop
                    }
                    if (!pattern.matcher(name).matches()) {
                        System.out.println("Your " + role + " name is unusual.");
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
        Scanner sc = new Scanner(System.in);

        // Prompt the user to input subject details
        System.out.println("Enter subject details:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Code: ");
        String code = sc.nextLine();
        System.out.print("Description: ");
        String description = sc.nextLine();

        // Create a new subject object
        Subject subject = new Subject(name, code, description,false);


    // Check if there's an instructor assigned to the subject
        if (subject.getInstructor() == null) {
            System.out.println("There is no instructor assigned to this subject.");
            System.out.println("Would you like to add an instructor? (yes/no)");
            String choice = sc.nextLine();
            Instructor instructor;
            if (choice.equalsIgnoreCase("yes")) {
                boolean validInstructorId = false;
                instructor= null ;
                while (!validInstructorId) {
                    // Prompt the user to input instructor details
                    System.out.println("Enter instructor ID:");
                    String instructorId = sc.nextLine();
                    // Find the instructor based on the provided ID
                    instructor = Instructor.findInstructorById(instructorId);

                    if (instructor != null) {
                        Subject newSubject = new Subject(name, code, description,true);
                        Subject.addSubject(newSubject);
                        subject.setInstructor(instructor);
                        validInstructorId = true;
                    } else {
                        System.out.println("No instructor found with the provided ID. Please try again.");
                    }
                }


            } else {
                Subject newSubject = new Subject(name, code, description,false);
                Subject.addSubject(newSubject);
                System.out.println("Subject saved without an instructor.");
            }
        }

        // Display subject details
        System.out.println("Subject added successfully:");
        subjectDetails(subject);


    }

    private static void editPerson(String role) {
        sc.nextLine();
        if (role.equalsIgnoreCase("Student")) {
            boolean validStudentId = false;
            Student student = null;
            while (!validStudentId) {
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
                    System.out.println("No student found with the provided ID. Please try again.");
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
    private static void enrollStudent(Student student){

    System.out.println("Enrolleee");
    }


}

