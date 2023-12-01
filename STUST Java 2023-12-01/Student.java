public class Student {
    // Attributes
    private String name;
    private int age;
    private String studentId;
    private double gpa;

    // Constructor
    public Student(String name, int age, String studentId, double gpa) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Display method
    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentId);
        System.out.println("GPA: " + gpa);
    }

    // Example of usage
    public static void main(String[] args) {
        // Creating a new student object
        Student student1 = new Student("John Doe", 20, "S12345", 3.5);

        // Displaying student information
        System.out.println("Student Information:");
        student1.displayStudentInfo();

        // Modifying student information
        student1.setAge(21);
        student1.setGpa(3.8);

        // Displaying updated information
        System.out.println("\nUpdated Student Information:");
        student1.displayStudentInfo();
    }
}
