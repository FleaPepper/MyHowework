package ru.geekbrains.Lesson3;

public class Main {

    public static void main(String[] args) {

        Group group = new Group("First group");
        Employee employee = new Employee("Andrew", "123", "123", 22);
        Employee employee1 = new Employee("Boris", "321", "321", 23);
        group.addEmployee(employee);
        group.addEmployee(employee1);
        group.getGroupInfo();
        group.deleteEmployee(1);
        group.getGroupInfo();

    }

}
