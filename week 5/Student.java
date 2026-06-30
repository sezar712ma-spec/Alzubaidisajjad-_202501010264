public class Student {
    // Private variables prevent direct outside access (Data Hiding)
    private String studentID;
    private String name;
    private double cgpa;
    private String programme; // Added as per Activity 3

    // Constructor to initialize the Student object
    public Student(String studentID, String name, double cgpa, String programme) {
        this.studentID = studentID;
        this.name = name;
        this.cgpa = cgpa;
        this.programme = programme;
    }

    // Setters (Mutators)
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCGPA(double cgpa) {
        // Example of validation encapsulation allows:
        if (cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        }
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    // Getters (Accessors)
    public String getStudentID() {
        return this.studentID;
    }

    public String getName() {
        return this.name;
    }

    public double getCGPA() {
        return this.cgpa;
    }

    public String getProgramme() {
        return this.programme;
    }
}