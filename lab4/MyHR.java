import java.util.Scanner;

class MyHR {
    public static void main(String args[]) {
        int i = 0;
        int choice = 0;
        Employee[] employeeList = new Employee[5];
        Office[] officeList = new Office[3];
        for (i = 0; i < 3; i++) {
            officeList[i] = new Office();
        }
        while (choice != 4) {
            System.out.println("1- List all offices");
            System.out.println("2- Create a new employee");
            System.out.println("3- List employees");
            System.out.println("4- Exit");
            Scanner choicein = new Scanner(System.in);
            System.out.print("Enter Choice :");
            choice = choicein.nextInt();
            switch (choice) {
                case 1:
                    for (i = 0; i < officeList.length; i++)
                        System.out.println(officeList[i].toString());

                    choice = -1;
                    break;
                case 2:
                    if (Employee.getEmployeeAmount() < 5) {
                        int empTemp = Employee.getEmployeeAmount();
                        System.out.println("Enter details for employee " + (Employee.getEmployeeAmount() + 1));

                        employeeList[Employee.getEmployeeAmount()] = new Employee();
                        Scanner officePick = new Scanner(System.in);
                        boolean empAdded = false;
                        while (!empAdded) {
                            System.out.println("Pick an office to place the employee into 1-3:");
                            empAdded = officeList[officePick.nextInt() - 1].AddEmpoyee(employeeList[empTemp]);
                        }
                    } else
                        System.out.println("5 employees already created");

                    choice = -1;
                    break;
                case 3:
                    for (i = 0; i < employeeList.length; i++) {
                        if (employeeList[i] != null)
                            System.out.println(employeeList[i].toString());
                    }
                    choice = -1;
                    break;
                case 4:
                    choice = 4;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}