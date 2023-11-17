public class Student extends Person {
    protected String name;
    protected String course;

    public Student(String nameIn, String courseIn) {
        super(nameIn);
        course = courseIn;
    }

    String getDescription() {
        return ("Name :" + super.getName() + "\nCourse :" + course);
    }

}
