public class Employee extends Person {
    protected String name;
    protected double annualSalary;

    public Employee(String nameIn, double salaryIn) {
        super(nameIn);
        annualSalary = salaryIn;
    }

    String getDescription() {
        return ("Name :" + super.getName() + "\nAnnual Salary :" + annualSalary);
    }

}
