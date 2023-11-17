public class TestPerson {

    public static void main(String args[]) {
        Person[] persons;
        persons = new Person[2];
        persons[0] = new Student("Greg", "Computing");
        persons[1] = new Employee("Greg", 50000.00);

        System.out.println(persons[0].getDescription());
        System.out.println(persons[1].getDescription());
    }
}
