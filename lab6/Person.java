public class Person {
    // Variables
    private String name;
    private String address;

    // Constructors
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    // toString
    public String toString() {
        return name + "(" + address + ")";
    }
}

class Teacher extends Person { // subclass Teacher
    private int numCourses;
    private String[] courses;

    public Teacher(String name, String address) { // constructor for name address and courses
        super(name, address);
        courses = new String[2];
        numCourses = 0;
    }

    public boolean addCourse(String course) {
        if (numCourses == 2)
            return false;

        else {
            courses[numCourses] = course;
            numCourses++;
            return true;
        }
    }

    public boolean removeCourse(String course) {
        if (numCourses == 0)
            return false;
        else {
            for (int i = 0; i < numCourses; i++) {
                if (courses[i] == course)
                    courses[i] = null;
                numCourses--;
            }
            return true;
        }
    }

    public String toString() {
        return "Teacher : " + getName() + " (" + getAddress() + ")";
    }
}

class Student extends Person { // subclass Student

    private int numCourses;
    private String[] courses;
    private int[] grades;

    public Student(String name, String address) {
        super(name, address);
        courses = new String[2];
        grades = new int[2];
        numCourses = 0;
    }

    public void addCourseGrade(String course, int grade) {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
    }

    public void printGrades() {
        System.out.println(toString() + " " + courses[0] + ":" + grades[0] + " " + courses[1] + ":" + grades[1]);
    }

    public double getAverageGrade() {
        return ((grades[0] + grades[1]) / 2);
    }

    public String toString() {
        return ("Student:" + this.getName() + " (" + this.getAddress() + ")");
    }

}