class Office {
    private static int nextOffice = 100;
    private int officeRoom;
    private int employeeAmount;
    private Employee[] employeeList;

    public Office() {
        employeeList = new Employee[2];
        officeRoom = nextOffice;
        nextOffice++;
        employeeAmount = 0;
    }

    public boolean AddEmpoyee(Employee employeeIn) {
        if (employeeAmount < 2) {
            employeeList[employeeAmount] = employeeIn;
            employeeAmount++;
            return true;
        } else
            System.out.println("Office is full");
        return false;
    }

    public String toString() {
        if (employeeAmount == 0)
            return ("Room :" + officeRoom + "\nEmployees :" + employeeAmount + "\n");
        else if (employeeAmount == 1)
            return ("Room :" + officeRoom + "\nEmployees [ ID : " + employeeList[0].getEmpoyeeNumber() + " ]\n");
        else
            return ("Room :" + officeRoom + "\nEmployees [ ID :" + employeeList[0].getEmpoyeeNumber() + ", ID : "
                    + employeeList[1].getEmpoyeeNumber() + " ]\n");
    }

}