package ru.geekbrains.Lesson3;

public class Group {

    private String groupName;
    private final static Employee[] employees = new Employee[10];

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public void addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                System.out.println("Employee added to the group.");
                return;
            }
            if (i == employees.length - 1 & employees[i] != null) {
                System.out.println("Group is full");
                return;
            }
        }
    }

    public void deleteEmployee(int index) {
        if (employees[index] != null) {
            employees[index] = null;
            System.out.println("Employee has been deleted from the group.");
        } else
            System.out.println("This index is empty.");
    }

    public void getGroupInfo() {
        for (Employee employee : employees) {
            if (employee != null)
                System.out.println(employee.getInfo());
        }
    }


}
