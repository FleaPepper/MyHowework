package ru.geekbrains.Lesson3;

public class Employee {

    private String name;
    private String email;
    private String position;
    private int age;

    public Employee(String name, String email, String position, int age) {
        this.name = name;
        this.email = email;
        this.position = position;
        this.age = age;
    }

    public String getInfo() {
        return name + ", " + age + ", " + position + ", " + email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPosition() {
        return position;
    }

    public int getAge() {
        return age;
    }
}
