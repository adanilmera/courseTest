package ru.adanil.employee_department;

public class Employee {
    private String name;
    private long salary;

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    public Employee(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }
}
