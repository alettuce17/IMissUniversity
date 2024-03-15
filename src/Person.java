public abstract class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private int age;



    public Person(String firstName, String lastName, String address, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
    }

    // Constructor with middle name
    public Person(String firstName, String middleName, String lastName, String address, int age) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void displayInfo() {
        System.out.println("Last Name: " + lastName);
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
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
    public String getFullName() {
        if (middleName != null && !middleName.isEmpty()) {
            return firstName + " " + middleName + " " + lastName;
        } else {
            return firstName + " " + lastName;
        }
    }
    // Getters and setters for all attributes
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null && !firstName.isEmpty()) {
            this.firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        } else {
            this.firstName = firstName;
        }
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        if (middleName != null && !middleName.isEmpty()) {
            this.middleName = middleName.substring(0, 1).toUpperCase() + middleName.substring(1);
            
        } else {
            this.middleName = middleName;
        }
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName != null && !lastName.isEmpty()) {
            this.lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
        } else {
            this.lastName = lastName;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

