import java.util.Scanner;

public class Employee {
    enum EmployeeType {
        MANAGER,
        STAFF,
    }

    private static int nextEmployee = 1000;
    private int employeeNumber;
    private EmployeeType type;
    private String carModel;
    private static int employeeAmount;
    private Address address;

    public Employee() {
        employeeAmount++;
        employeeNumber = nextEmployee;
        nextEmployee++;
        address = new Address();
        Scanner empType = new Scanner(System.in);
        boolean inputValid = false;
        String input;
        while (!inputValid) {
            System.out.println("Enter employee type Manager/Staff :");
            input = empType.nextLine().toUpperCase();
            if (input.equals("STAFF") || input.equals("MANAGER")) {
                EmployeeType emp = EmployeeType.valueOf(input);
                type = emp;
                inputValid = true;
            } else
                System.out.println("Invalid input");
        }
        if (type.equals(EmployeeType.MANAGER)) {
            Scanner carIn = new Scanner(System.in);
            System.out.println("Enter Company car model :");
            carModel = carIn.nextLine();
        }
    }

    public String toString() {
        if (type == EmployeeType.MANAGER)
            return ("Type: " + type + "\nEmployee Number : " + employeeNumber + "\nCompany Car : " + carModel
                    + "\n--Address--\n" + address.toString());
        else
            return ("Employee :" + type + "\nEmployee Number :" + employeeNumber + "\n--Address--\n"
                    + address.toString());
    }

    public int getEmpoyeeNumber() {
        return employeeNumber;
    }

    public static int getEmployeeAmount() {
        return employeeAmount;
    }
}
